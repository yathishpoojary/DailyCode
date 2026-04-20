package Practice20th;

import java.util.List;
import java.util.stream.Collectors;

public class ConvertTheStringUppercaseandSort {
    public static void main(String[] args) {
        List<String> names = List.of("banana", "apple", "cherry", "mango");
        List<String> res = names.stream().map(String::toUpperCase).sorted(String::compareToIgnoreCase).collect(Collectors.toList());
        System.out.println(" Res "+res);
    }
}
