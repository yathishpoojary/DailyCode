package StreamsPractice;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class GreaterThanAverage {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 110);

        double avge = numbers.stream().mapToInt(a->a).average().orElse(0);

        numbers.stream().filter(f-> f> avge).forEach(System.out::println);

    }
}
