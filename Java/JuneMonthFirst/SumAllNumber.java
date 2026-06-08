package JuneMonthFirst;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class SumAllNumber {
    public static void main(String[] args) {
    List<Integer> lst = Arrays.asList(1,2,3,5);
    int sum  = lst.stream().mapToInt(Integer::intValue).sum();
    int sum2 = lst.stream().reduce(0,Integer::sum);
    System.out.println(sum);
    System.out.println(sum2);

    Optional<Integer> max = lst.stream().max(Integer::compareTo);
    Optional<Integer> min = lst.stream().min(Integer::compareTo);
    System.out.println("max "+max);
        System.out.println("Min "+min);


        String value[] = {"Mattt"};
        List<String> res = Arrays.stream(value).map(String::toUpperCase).collect(Collectors.toList());
        System.out.println("Res  "+res);
    }
}
