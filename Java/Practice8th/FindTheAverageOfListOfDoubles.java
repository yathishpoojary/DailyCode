package Practice8th;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

public class FindTheAverageOfListOfDoubles {
    public static void main(String[] args) {
//        List<Double> list = Arrays.asList(1.1,2.2,3.3);
        List<Double> list = Arrays.asList(1.5,2.5,3.5,4.5);
        OptionalDouble res = list.stream().mapToDouble(Double::doubleValue).average();
        System.out.println("Res "+res);
    }
}
