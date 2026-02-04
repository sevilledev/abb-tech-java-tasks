package lesson8.smartlibrary;

import java.util.*;
import java.util.stream.Collectors;

public class LibraryService {
    List<Book> books;
    List<User> users;

    public LibraryService(List<Book> books, List<User> users) {
        this.books = books;
        this.users = users;
    }

    public void sortBooks() {
        System.out.println("\nSorted Books:");
        books.stream()
                .sorted(Comparator.comparing(Book::getRating).reversed()
                        .thenComparing(Book::getYear)
                        .thenComparing(Book::getTitle)
                ).forEach(System.out::println);
    }

    public void getAverageBookRating() {
        double avg = books.stream()
                .mapToDouble(Book::getRating).average()
                .orElse(0.0);
        System.out.println("\nAverage Book Rating: " + avg);
    }

    public void getAvailableBooks() {
        System.out.println("\nAvailable Books (year > 2000):");
        books.stream()
                .filter(book -> book.getYear() > 2000)
                .filter(Book::isAvailable)
                .forEach(System.out::println);
    }

    public void getMostTakenBook() {
        System.out.println("\nMost Borrowed Book:");
        users.stream()
                .flatMap(user -> user.getBorrowHistory().stream())
                .collect(Collectors.groupingBy(BorrowRecord::getBook, Collectors.counting()))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .ifPresent(entry ->
                        System.out.println(entry.getKey().getTitle() + " (" + entry.getValue() + " times borrowed)")
                );
    }

    public void getNotReturnedBooks() {
        System.out.println("\nCurrently Borrowed Books:");
        users.stream()
                .collect(Collectors.toMap(
                        User::getName,
                        user -> user.getBorrowHistory().stream()
                                .filter(rec -> rec.getReturnedDate() == null)
                                .map(BorrowRecord::getBook)
                                .collect(Collectors.toList())
                )).forEach((user, books) ->
                        System.out.println(user + " has not returned: " + books)
                );
    }

    public void getBooksGroupedByAuthor() {
        System.out.println("\nBooks Grouped by Author:");
        books.stream()
                .filter(book -> book.getYear() > 1950)
                .collect(Collectors.groupingBy(Book::getAuthor) // I think first filter() then groupingBy() is more good approach
                ).forEach((author, books) -> System.out.println(author + ": " + books));
    }

    public void analyzeLibrary() {
        System.out.println("\n--- Library Analysis ---");
        getAverageBookRating();
        getAvailableBooks();
        getMostTakenBook();
        getNotReturnedBooks();
        getBooksGroupedByAuthor();
    }

    public void uniqueAuthorsRead() {
        System.out.println("\nUnique Authors Read by Users:");
        users.stream()
                .flatMap(user -> user.getBorrowHistory().stream())
                .map(rec -> rec.getBook().getAuthor())
                .collect(Collectors.toSet()) // in my opinion, we can also use .distinct() instead of collect()
                .forEach(System.out::println);
    }

    Optional<Book> findRecommendedBookForUser(User user) {
        if (user.getBorrowHistory().isEmpty()) return Optional.empty();

        String favAuthor = user.getBorrowHistory().stream()
                .map(rec -> rec.getBook().getAuthor())
                .collect(Collectors.groupingBy(author -> author, Collectors.counting()))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(null);

        if (favAuthor == null) return Optional.empty();

        return books.stream()
                .filter(Book::isAvailable)
                .filter(book -> book.getAuthor().equals(favAuthor))
                .max(Comparator.comparingDouble(Book::getRating));
    }

    Optional<User> findTopReaderOfMonth(int month, int year) {
        return users.stream()
                .collect(Collectors.toMap(
                        user -> user,
                        user -> user.getBorrowHistory().stream()
                                .filter(rec ->
                                        rec.getBorrowedDate().getMonthValue() == month &&
                                        rec.getBorrowedDate().getYear() == year)
                                .count()
                )).entrySet().stream()
                .filter(entry -> entry.getValue() > 0)
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey); // key is user (line 111 we defined)
    }
}
