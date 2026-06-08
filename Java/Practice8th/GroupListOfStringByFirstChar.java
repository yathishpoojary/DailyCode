package Practice8th;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupListOfStringByFirstChar {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("RAJU","BOLU","NNEDu","RAM","BHIM","HESa");

        Map<Character, List<String>> res = list.stream().collect(Collectors.groupingBy(s-> s.charAt(0)));
        System.out.println("Res "+ res);
    }
}
