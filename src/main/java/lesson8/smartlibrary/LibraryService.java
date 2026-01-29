package lesson8.smartlibrary;

import java.util.Comparator;
import java.util.List;

public class LibraryService {
    List<Book> books;
    List<User> users;

    public LibraryService(List<Book> books, List<User> users) {
        this.books = books;
        this.users = users;
    }

    public List<Book> sortedBooks() {
        return books.stream()
                .sorted(Comparator.comparing(Book::getRating).reversed()
                        .thenComparing(Book::getYear)
                ).toList();
    }
}
