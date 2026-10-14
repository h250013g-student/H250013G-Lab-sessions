import java.util.Arrays;
public class Exercise1PrintOverload {
    static void print(int x) { System.out.println(x); }
    static void print(double x) { System.out.println(x); }
    static void print(String x) { System.out.println(x); }
    static void print(int[] x) { System.out.println(Arrays.toString(x)); }
    public static void main(String[] args) { print(5); print(2.5); print("Java"); print(new int[]{1,2,3}); }
}
