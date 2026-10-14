import java.util.Iterator;
import java.util.NoSuchElementException;
class SimpleLinkedList implements Iterable<String> {
    private static class Node {
        String value; Node next;
        Node(String value) { this.value = value; }
    }
    private Node head, tail;
    void add(String value) {
        Node node = new Node(value);
        if (head == null) head = node;
        else tail.next = node;
        tail = node;
    }
    private class ListIterator implements Iterator<String> {
        private Node current = head;
        public boolean hasNext() { return current != null; }
        public String next() {
            if (!hasNext()) throw new NoSuchElementException();
            String value = current.value; current = current.next; return value;
        }
    }
    public Iterator<String> iterator() { return new ListIterator(); }
}
public class Exercise4SimpleLinkedList {
    public static void main(String[] args) {
        SimpleLinkedList list = new SimpleLinkedList();
        list.add("Java"); list.add("OOP");
        for (String item : list) System.out.println(item);
    }
}
