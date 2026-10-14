import java.util.*;
public class Exercise3GenericStack {
    static class Stack<T> { private final ArrayList<T> items=new ArrayList<>(); void push(T value){items.add(value);} T pop(){if(isEmpty())throw new IllegalStateException("Empty stack");return items.remove(items.size()-1);} T peek(){if(isEmpty())throw new IllegalStateException("Empty stack");return items.get(items.size()-1);} boolean isEmpty(){return items.isEmpty();} }
    public static void main(String[] args) { Stack<String> s=new Stack<>(); s.push("Java");s.push("OOP");System.out.println(s.peek());System.out.println(s.pop());System.out.println(s.isEmpty()); }
}
