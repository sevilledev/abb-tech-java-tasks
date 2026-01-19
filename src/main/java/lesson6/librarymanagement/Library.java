package lesson6.librarymanagement;

import java.util.*;

public class Library {
    List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public List<Book> searchByTitle(String title) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                result.add(book);
            }
        }
        return result;
    }

    public List<Book> searchByAuthor(String author) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                result.add(book);
            }
        }
        return result;
    }

    public List<Book> searchByGenre(String genre) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getGenre().equalsIgnoreCase(genre)) {
                result.add(book);
            }
        }
        return result;
    }

    public void displayBooks() {
        for (Book book : books) {
            System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor() +
                               ", Genre: " + book.getGenre() + ", Year: " + book.getPublicationYear());
        }
    }

    public int getTotalBooks() {
        return books.size();
    }

    public void displayAllBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void sortedByTitle() {
        Collections.sort(books);
    }

    public void sortedByAuthor(Comparator<Book> comparator) {
        books.sort(comparator);
    }

    public void sortedByYear(Comparator<Book> comparator) {
        books.sort(comparator);
    }
}
