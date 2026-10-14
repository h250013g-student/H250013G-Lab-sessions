import java.util.ArrayList;
class SimpleStack<T> {
    private ArrayList<T> items = new ArrayList<>();
    void push(T value) { items.add(value); }
    T pop() { return items.remove(items.size() - 1); }
    T peek() { return items.get(items.size() - 1); }
    boolean isEmpty() { return items.isEmpty(); }
}
public class Exercise3GenericStack {
    public static void main(String[] args) {
        SimpleStack<String> stack = new SimpleStack<>();
        stack.push("Java"); stack.push("OOP");
        System.out.println("Top: " + stack.peek());
        System.out.println("Removed: " + stack.pop());
        System.out.println("Empty? " + stack.isEmpty());
    }
}
