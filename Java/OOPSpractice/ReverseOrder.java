package OOPSpractice;

import java.util.Arrays;
import  java.util.*;
import java.util.stream.*;
//import java.util.stream.IntStream;

public class ReverseOrder {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(12,33,54,22,43,222,34,1);

        List<Integer> neatReverrse = IntStream.range(0,list.size()).mapToObj(i->list.get(list.size()-i-1)).collect(Collectors.toList());

        List<Integer> reversed = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(list);
       System.out.println(neatReverrse);
    }
}
