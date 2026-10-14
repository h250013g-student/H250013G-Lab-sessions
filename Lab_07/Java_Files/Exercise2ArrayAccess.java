public class Exercise2ArrayAccess {
    static void printElement(int[] values,int index) { try { System.out.println(values[index]); } catch(ArrayIndexOutOfBoundsException e) { System.out.println("Invalid array index"); } }
    public static void main(String[] args) { printElement(new int[]{10,20,30},1); printElement(new int[]{10,20,30},5); }
}
