package StreamsPractice;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NonRepeatCharecter {
    public static void main(String[] args) {

        String str = "YYathish";

        Character ch = str.chars().mapToObj(c-> (char) c )
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        LinkedHashMap::new, Collectors.counting())).
                entrySet().stream().filter(f->f.getValue()==1).
                map(Map.Entry::getKey).findFirst().orElse(null);
        List<Character> ch1 = str.chars().mapToObj(c-> (char) c )
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        LinkedHashMap::new, Collectors.counting())).
                entrySet().stream().filter(f->f.getValue()>1).
                map(Map.Entry::getKey).collect(Collectors.toList());

        System.out.println(ch1);







//        Character ch = str.chars().mapToObj(c-> (char) c)
//                .collect(Collectors.groupingBy(
//                        Function.identity(),
//                        LinkedHashMap::new,
//                        Collectors.counting())).entrySet().stream().filter(e->e.getValue()==1).map(Map.Entry::getKey).findFirst().orElse(null);
        System.out.println(ch);

    }
}
