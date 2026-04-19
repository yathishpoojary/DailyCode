package StreamsPractice;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class EvenNumberFromList {
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5,6,7,8,9,0,222,4};

        Arrays.stream(arr).filter(a->a%2==0).forEach(System.out::println);
        int val = Arrays.stream(arr).filter(a->a%2==0).sum();
        System.out.println(val);
        OptionalInt findFirst =  Arrays.stream(arr).filter(a->a%2==0).findFirst();
    }
}
