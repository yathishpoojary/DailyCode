package May.May16;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class TestStream {
    public static void main(String[] args) {
        List<Integer> list =Arrays.asList(11,11,3,22,33,45,3);
        System.out.println(" list "+list);
        List<Integer> list2 = list.stream().distinct().toList();
        System.out.println(" list2 "+list2);
        int count = IntStream.of(1,2,4).sum();
        System.out.println(" coiunt "+count );
    }
}
