import java.util.*;
public class Exercise1IntegerList {
    public static void main(String[] args) { ArrayList<Integer> nums=new ArrayList<>(List.of(4,8,2,9,1,6,3,10,5,7)); int sum=0,max=nums.get(0); for(int n:nums){sum+=n;if(n>max)max=n;} System.out.println("List: "+nums); System.out.println("Sum: "+sum); System.out.println("Maximum: "+max); Collections.reverse(nums); System.out.println("Reverse: "+nums); }
}
