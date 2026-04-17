package Practice17;
import java.util.List;
import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Stream;

import static Practice17.EvenNumber.getEvenNumber;

public class EvenNumber {
    public static void main(String[] args) {

        int[] array= {1,2,3,4,5,6,7,8,9,0};
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,0);

        System.out.println("Array " + Arrays.toString(array));
        System.out.println("List "+ list);

        Predicate<Integer> condition = f-> f%2==0;
        EvenNumber.getEvenNumber(list.stream(), condition);
        EvenNumber.getEvenNumber(Arrays.stream(array).boxed(), condition);
    }

     static void  getEvenNumber(Stream<Integer> list, Predicate<Integer> condition) {
        list.filter(condition).forEach(System.out::println);

    }
}
