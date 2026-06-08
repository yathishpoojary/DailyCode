package Practice8th;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountTheFrequencyOfEachList {
    public static void main(String[] args) {
//        List<Integer> list = Arrays.asList(1,11,2,2,2,2,3,4,2,3,4,5,6,7,8,9);
        List<String> list = Arrays.asList("1","11","2","2","2","2","3","4","2","3");

                 Map<Integer,Long> res = list.stream().map(Integer::parseInt).collect(Collectors.groupingBy(e->e,Collectors.counting()));

                 System.out.println("Res "+res);
    }
}
