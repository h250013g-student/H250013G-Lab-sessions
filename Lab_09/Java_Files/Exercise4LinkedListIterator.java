import java.util.*;

class Node {
    String value;
    Node next;

    Node(String value) {
        this.value = value;
    }
}

public class Exercise4LinkedListIterator implements Iterable<String> {
    private Node head;
    private Node tail;

    void add(String value) {
        Node node = new Node(value);
        if (head == null) {
            head = node;
        } else {
            tail.next = node;
        }
        tail = node;
    }

    @Override
    public Iterator<String> iterator() {
        return new Iterator<>() {
            private Node current = head;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public String next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                String value = current.value;
                current = current.next;
                return value;
            }
        };
    }

    public static void main(String[] args) {
        Exercise4LinkedListIterator list = new Exercise4LinkedListIterator();
        list.add("Java");
        list.add("OOP");
        // The for-each loop obtains its values from iterator().
        for (String item : list) {
            System.out.println(item);
        }
    }
}
