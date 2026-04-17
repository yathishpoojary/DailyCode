package Practice17;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicate {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(11,2,3,4,4,4,5,3,2,4,2);
       List<Integer> newList= list.stream().distinct().toList();
       System.out.println(" NewList "+newList);
        System.out.println(" List "+list);
        Set<Integer> newSet = list.stream().collect(Collectors.toSet());
        System.out.println(" newSet  "+newSet);
        System.out.println(" newSet Strema  "+list.stream().collect(Collectors.toCollection(LinkedHashSet::new)));

        System.out.println(" newSet  C "+ new LinkedHashSet<>(list));

    }
}
