import java.util.*;
import java.util.stream.*;

public class StreamExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 5, 8, 10, 15, 20);

        List<Integer> squares = numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .collect(Collectors.toList());

        System.out.println("Squares of even numbers: " + squares);

        int sum = numbers.stream()
                .filter(n -> n > 10)
                .reduce(0, Integer::sum);

        System.out.println("Sum of numbers > 10: " + sum);

        List<String> sentences = Arrays.asList("Java Streams are powerful", "Practice makes perfect");
        List<String> words = sentences.stream()
                .flatMap(s -> Arrays.stream(s.split(" ")))
                .collect(Collectors.toList());

        System.out.println("Words: " + words);
    }
}