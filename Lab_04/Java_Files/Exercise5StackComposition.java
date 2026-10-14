import java.util.ArrayList;
public class Exercise5StackComposition {
    static class Stack { private final ArrayList<Integer> items = new ArrayList<>();
        void push(int value) { items.add(value); }
        int pop() { if (items.isEmpty()) throw new IllegalStateException("Stack is empty"); return items.remove(items.size() - 1); }
        boolean isEmpty() { return items.isEmpty(); }
    }
    public static void main(String[] args) { Stack s = new Stack(); s.push(10); s.push(20); System.out.println(s.pop()); }
}
