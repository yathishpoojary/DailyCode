package StreamsPractice;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        String st = "abcbcaabc";
        Map<Character, Long> chr =    st.chars().mapToObj(m->(char) m).collect(Collectors.groupingBy(v->v, Collectors.counting()));
        System.out.println(" chr "+ chr);
    }
}
