package Practice20th;
import java.util.*;
import java.util.stream.Collectors;

public class ArrangeStringByNumberOfLetters {
    public static void main(String[] args) {

        List<String> words = List.of("cat", "dog", "elephant", "ant", "bear", "lion");
        Map<Integer, List<String>> res = words.stream().collect(Collectors.groupingBy(String::length));
        System.out.println("Res "+res);


    }
}
