package JuneMonthFirst;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<String> lst = Arrays.asList("Helo", "Hello","new","new","Make","Make","aa","Helo2");
        System.out.println(lst);
        List<String> res = lst.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(res);
    }
}
