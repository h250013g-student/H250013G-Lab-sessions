import java.util.*;

class GenericStack<T> {
    private final ArrayList<T> items = new ArrayList<>();

    void push(T value) {
        items.add(value);
    }

    T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Empty stack");
        }
        return items.remove(items.size() - 1);
    }

    T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Empty stack");
        }
        return items.get(items.size() - 1);
    }

    boolean isEmpty() {
        return items.isEmpty();
    }
}

public class Exercise3GenericStack {
    public static void main(String[] args) {
        GenericStack<String> stack = new GenericStack<>();
        stack.push("Java");
        stack.push("OOP");
        // Peeking leaves the top value in place for the following pop.
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());
    }
}
