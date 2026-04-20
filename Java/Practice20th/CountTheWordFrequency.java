package Practice20th;

import java.util.*;
import java.util.stream.Collectors;

public class CountTheWordFrequency {
    public static void main(String[] args) {
        String sentence = "java is great and java is powerful and java";
         Map<String,Long> res = Arrays.stream(sentence.split(" ")).collect(Collectors.groupingBy(f->f, Collectors.counting()));
            System.out.println(" Frequency "+ res);
    }
}
