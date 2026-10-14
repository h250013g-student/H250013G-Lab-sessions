import java.util.*;
public class Exercise4WordFrequency {
    public static void main(String[] args) { String text="java oop java classes oop java"; Map<String,Integer> freq=new HashMap<>(); for(String word:text.split(" ")) freq.merge(word,1,Integer::sum); freq.entrySet().stream().sorted(Map.Entry.<String,Integer>comparingByValue().reversed().thenComparing(Map.Entry.comparingByKey())).forEach(e->System.out.println(e.getKey()+": "+e.getValue())); }
}
