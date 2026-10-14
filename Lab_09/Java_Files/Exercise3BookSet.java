import java.util.*;
public class Exercise3BookSet {
    static class Book { String isbn,title; Book(String i,String t){isbn=i;title=t;} public boolean equals(Object o){return o instanceof Book b && isbn.equals(b.isbn);} public int hashCode(){return isbn.hashCode();} }
    public static void main(String[] args) { Set<Book> books=new HashSet<>(); books.add(new Book("123","Java Basics")); books.add(new Book("123","Java Basics second copy")); System.out.println("Unique books: "+books.size()); }
}
