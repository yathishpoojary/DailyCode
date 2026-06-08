package Practice8th;

import java.util.*;

public class SecondLargestNumber {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14);
   Optional<Integer> val = list.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst();
System.out.println("val "+val);

    }
}
