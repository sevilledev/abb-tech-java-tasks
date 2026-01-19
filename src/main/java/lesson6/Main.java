package lesson6;

import lesson6.librarymanagement.*;

public class Main {
    public static void main(String[] args) {

        // Object comparison
        Book b1 = new Book("Design Patterns", "Erich Gamma", "Software Engineering", 1994);
        Book b2 = new Book("Design Patterns", "Erich Gamma", "Software Engineering", 1994);
        Book b3 = b1;

        System.out.println(b1 == b2); // false
        System.out.println(b1 == b3); // true

        System.out.println(b1.equals(b2)); // true

        // Library operations
        Library library = new Library();

        library.addBook(b1);
        library.addBook(b2);
        library.addBook(new Book("Clean Code", "Robert Martin", "Programming", 2008));
        library.addBook(new Book("Effective Java", "Joshua Bloch", "Programming", 2018));

        System.out.println("\nAll books:");
        library.displayBooks();

        System.out.println("\nSearch by author:");
        System.out.println(library.searchByAuthor("robert martin"));

        System.out.println("\nSearch by title:");
        System.out.println(library.searchByTitle("clean code"));

        System.out.println("\nSearch by genre:");
        System.out.println(library.searchByGenre("software engineering"));

        System.out.println("\nTotal books:");
        System.out.println(library.getTotalBooks());

        // Sorting
        System.out.println("\nBy title (Comparable):");
        library.sortedByTitle();
        library.displayBooks();

        System.out.println("\nBy author (Comparator):");
        library.sortedByAuthor(new AuthorComparator());
        library.displayBooks();

        System.out.println("\nBy publication year (Comparator):");
        library.sortedByYear(new YearComparator());
        library.displayBooks();
    }
}
