import java.util.Arrays;

public class Exercise1PrintOverload {
    static void print(int value) {
        System.out.println(value);
    }

    static void print(double value) {
        System.out.println(value);
    }

    static void print(String value) {
        System.out.println(value);
    }

    static void print(int[] values) {
        System.out.println(Arrays.toString(values));
    }

    public static void main(String[] args) {
        // Java selects the overload that matches each argument type.
        print(5);
        print(2.5);
        print("Java");
        print(new int[] {1, 2, 3});
    }
}
