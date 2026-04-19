package StreamsPractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SumOfElements {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int sum = numbers.stream().reduce(0,(a,b)-> a+b);
        System.out.println(" Sum "+sum);

        //Method 2
        int sum2 = numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println(" Sum2 "+sum2);

        //Collectors method
        int sum3 = numbers.stream().collect(Collectors.summingInt(n->n));
        System.out.println(" Sum3 "+sum3);

// Expected → Sum: 55
    }
}
