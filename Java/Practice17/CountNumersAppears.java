package Practice17;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.stream.Collectors;

public class CountNumersAppears {
    public static void main(String []args) {
        int[] array = {1,2,33,33,4,5,3,4,31,1,0,0,4};

//        Map<Integer, Long> map = Arrays.stream(array)
//                .boxed()
//                .collect(Collectors.groupingBy(n -> n, Collectors.counting()));
        Map<Integer, Long> ma1p = Arrays.stream(array)
                .boxed()
                .collect(Collectors.groupingBy(n -> n, Collectors.counting()));
        System.out.println(ma1p);
    }
}
