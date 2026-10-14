import java.util.*;
class Book {
    String isbn, title;
    Book(String isbn, String title) { this.isbn = isbn; this.title = title; }
    public boolean equals(Object obj) {
        if (!(obj instanceof Book other)) return false;
        return isbn.equals(other.isbn);
    }
    public int hashCode() { return isbn.hashCode(); }
}
public class Exercise3BookSet {
    public static void main(String[] args) {
        Set<Book> books = new HashSet<>();
        books.add(new Book("123", "Java Basics"));
        books.add(new Book("123", "Java Basics Second Copy"));
        System.out.println("Books stored: " + books.size());
    }
}
