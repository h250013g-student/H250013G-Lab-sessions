import java.util.Arrays;
class Printer {
    void print(int value) { System.out.println(value); }
    void print(double value) { System.out.println(value); }
    void print(String value) { System.out.println(value); }
    void print(int[] values) { System.out.println(Arrays.toString(values)); }
}
public class Exercise1PrintOverload {
    public static void main(String[] args) {
        Printer p = new Printer();
        p.print(10); p.print(2.5); p.print("Java"); p.print(new int[]{1, 2, 3});
    }
}
