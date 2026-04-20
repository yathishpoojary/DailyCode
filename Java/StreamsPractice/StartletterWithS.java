package StreamsPractice;

import java.util.Arrays;
import java.util.List;

public class StartletterWithS {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "James", "Bob", "Mary", "Jake", "Peter");
        names.stream().filter(s->s.startsWith("J")).forEach(System.out::println);
// Find all names starting with "J"
// Expected → [John, James, Jake]
    }
}
