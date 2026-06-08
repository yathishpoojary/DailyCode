package Practice8th;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FindTheElementsMoreThanOnce {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,1);
      List<Integer>res =   list.stream().filter(f-> Collections.frequency(list,f) >1).distinct().collect(Collectors.toList());
      System.out.println("Res "+res);
        }
}
