package Practice8th;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FindTheLongestStringIntheList {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("MATSFSD","FFFqwweFF");
        Optional<String> res = list.stream().max(Comparator.comparingInt(String::length));
        System.out.println("Res "+res);
    }
}
