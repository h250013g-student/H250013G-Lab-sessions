import java.util.*;

class Book {
    String isbn;
    String title;

    Book(String isbn, String title) {
        this.isbn = isbn;
        this.title = title;
    }

    @Override
    public boolean equals(Object other) {
        return other instanceof Book book && isbn.equals(book.isbn);
    }

    @Override
    public int hashCode() {
        // ISBN is the identity used by both equality and hash-based sets.
        return isbn.hashCode();
    }
}

public class Exercise3BookSet {
    public static void main(String[] args) {
        Set<Book> books = new HashSet<>();
        books.add(new Book("123", "Java Basics"));
        books.add(new Book("123", "Java Basics second copy"));
        System.out.println("Unique books: " + books.size());
    }
}
