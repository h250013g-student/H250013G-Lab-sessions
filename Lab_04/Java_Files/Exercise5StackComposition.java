import java.util.ArrayList;

class Stack {
    private final ArrayList<Integer> items = new ArrayList<>();

    void push(int value) {
        items.add(value);
    }

    int pop() {
        if (items.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return items.remove(items.size() - 1);
    }

    boolean isEmpty() {
        return items.isEmpty();
    }
}

public class Exercise5StackComposition {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        // The most recently pushed item is removed first.
        System.out.println(stack.pop());
    }
}
