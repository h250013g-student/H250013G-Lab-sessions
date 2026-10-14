import java.util.ArrayList;
class SimpleStack {
    private ArrayList<Integer> items = new ArrayList<>();
    void push(int value) { items.add(value); }
    int pop() { return items.remove(items.size() - 1); }
    boolean isEmpty() { return items.isEmpty(); }
}
public class Exercise5StackComposition {
    public static void main(String[] args) {
        SimpleStack stack = new SimpleStack();
        stack.push(10); stack.push(20);
        System.out.println(stack.pop());
    }
}
