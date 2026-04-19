package StreamsPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class RemoveDuplicateFromList {
    public static void main(String []args) {
        System.out.println("Hi");
        List<List<Integer>> list = Arrays.asList(Arrays.asList(1,2),Arrays.asList(2,3),Arrays.asList(1,2));
        System.out.println(list);
        list.stream().distinct().forEach(System.out::println);

        System.out.println(" Second Option ");
        List<List<Integer>> linkedHashsetOption = new ArrayList<>(new LinkedHashSet<>(list));
        System.out.println(" linkedHashsetOption "+linkedHashsetOption);


        System.out.println(" Using the simple for loop ");
        List<List<Integer>> usingForLoop = new ArrayList<>();

        for(List<Integer> lst: list) {
           if( !usingForLoop.contains(lst)) {
                usingForLoop.add(lst);
            }
        }

        System.out.println(" Answer "+usingForLoop);



    }
}
