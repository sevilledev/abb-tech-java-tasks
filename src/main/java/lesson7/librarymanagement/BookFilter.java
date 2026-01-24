package lesson7.librarymanagement;

public interface BookFilter {
    boolean filter(Library<?>.Book book);
}
