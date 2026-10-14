import java.util.*;
public class Exercise4LinkedListIterator implements Iterable<String> {
    private static class Node { String value; Node next; Node(String v){value=v;} }
    private Node head,tail;
    void add(String value){Node n=new Node(value);if(head==null)head=n;else tail.next=n;tail=n;}
    public Iterator<String> iterator(){return new Iterator<>(){Node current=head;public boolean hasNext(){return current!=null;}public String next(){if(!hasNext())throw new NoSuchElementException();String v=current.value;current=current.next;return v;}};}
    public static void main(String[] args){Exercise4LinkedListIterator list=new Exercise4LinkedListIterator();list.add("Java");list.add("OOP");for(String item:list)System.out.println(item);}
}
