import java.nio.file.*;import java.io.*;import java.util.*;
public class Exercise1SaveReadLines {
    public static void main(String[] args) throws IOException { Scanner sc=new Scanner(System.in); List<String> lines=new ArrayList<>(); for(int i=1;i<=5;i++){System.out.print("Line "+i+": ");lines.add(sc.nextLine());} Path file=Path.of("lab10-lines.txt"); Files.write(file,lines); System.out.println("Saved lines:"); for(String line:Files.readAllLines(file))System.out.println(line); }
}
