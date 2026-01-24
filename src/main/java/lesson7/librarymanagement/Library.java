package lesson7.librarymanagement;

import java.util.*;

public class Library<T extends Library.Section> {
    private List<T> sections = new ArrayList<>();

    void addSection(T section) {
        sections.add(section);
    }

    void displaySections() {
        for (T section : sections) {
            System.out.println("Section: " + section.getName());
            for (Library<?>.Book book : section.getBooks()) {
                System.out.println("  " + book);
            }
        }
    }

    public static class Section {
        private String name;
        private List<Library<?>.Book> books;

        public Section(String name) {
            this.name = name;
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

        public String getTitle() {
            return title;
        }

        public String getAuthor() {
            return author;
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
