package StreamsPractice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortBasedOnLength {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Alexander", "Bob", "Mary", "Christopher");

        names.stream().sorted(Comparator.comparingInt(String::length)).forEach(System.out::println);
// Expected → [Bob, John, Mary, Alexander, Christopher]
    }
}
