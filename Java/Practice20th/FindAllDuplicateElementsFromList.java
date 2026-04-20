package Practice20th;

import java.util.HashSet;
import java.util.List;

public class FindAllDuplicateElementsFromList {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 2, 4, 3, 5, 1);

        HashSet<Integer> set = new HashSet<>();

        List<Integer> list = numbers.stream().filter(f->!set.add(f)).toList();

        System.out.println(
                "List "
+list        );

    }
}
