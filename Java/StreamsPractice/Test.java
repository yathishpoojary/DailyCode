package StreamsPractice;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        String st = "abcbcaabc";

      List<Character>ch=  st.chars().mapToObj(m->(char) m ).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())).entrySet().stream().filter(f->f.getValue()> 1).map(Map.Entry::getKey).collect(Collectors.toList());

        Map<Character, Long> chr =    st.chars().mapToObj(m->(char) m).collect(Collectors.groupingBy(v->v, Collectors.counting()));
        System.out.println(" chr "+ chr);
    }
}
