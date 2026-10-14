import java.nio.file.*;import java.io.*;import java.util.*;import java.util.stream.*;
public class Exercise5LearnerReports {
    record Learner(String name,int marks){String band(){if(marks>=80)return "A";if(marks>=60)return "B";return "C";}}
    public static void main(String[] args)throws IOException{Path input=Path.of("learners.csv");if(!Files.exists(input))Files.write(input,List.of("Leslie Sarai,86","Tariro,72","Rudo,55"));List<Learner> learners=Files.lines(input).map(line->line.split(",")).map(a->new Learner(a[0].trim(),Integer.parseInt(a[1].trim()))).toList();Map<String,List<Learner>> groups=learners.stream().collect(Collectors.groupingBy(Learner::band));for(String band:List.of("A","B","C")){List<String> report=groups.getOrDefault(band,List.of()).stream().map(l->l.name()+","+l.marks()).toList();Files.write(Path.of("grade-"+band+"-report.txt"),report);System.out.println("Wrote grade-"+band+"-report.txt: "+report.size()+" learner(s)");}}
}
