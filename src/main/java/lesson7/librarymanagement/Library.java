package lesson7.librarymanagement;

import java.util.*;

public class Library<T extends Library.Section> {
    private List<T> sections = new ArrayList<>();

    void addSection(T section) {
        sections.add(section);
    }

    void displaySections() {
        for (T section : sections) {
            System.out.println("\nSection: " + section.getName());
            section.displayBooks();
        }
    }

    void filterBooks(BookFilter filter) {
        System.out.println("\nFiltered Books:");
        for (T section: sections) {
            for (Library<?>.Book book : section.getBooks()) {
                if (filter.filter(book)) {
                    System.out.println(book);
                }
            }
        }
    }

    public static class Section {
        private String name;
        private List<Library<?>.Book> books;

        public Section(String name) {
            this.name = name;
            this.books = new ArrayList<>();
        }

        public String getName() {
            return name;
        }

        public List<Library<?>.Book> getBooks() {
            return books;
        }

        public void addBook(Library<?>.Book book) {
            books.add(book);
        }

        public void displayBooks() {
            for (Library<?>.Book book : books) {
                System.out.println(book);
            }
        }
    }

    public class Book {
        private String title;
        private String author;
        private int year;

        Book(String title, String author, int year) {
            this.title = title;
            this.author = author;
            this.year = year;
        }

        public int getYear() {
            return year;
        }

        @Override
        public String toString() {
            return "Book{" +
                    "title='" + title + '\'' +
                    ", author='" + author + '\'' +
                    ", year=" + year +
                    '}';
        }
    }
}
