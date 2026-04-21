package Practice20th;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        String st = "Non Repeated Chrecter";

      Character val=  st.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())).entrySet().stream().filter(f->f.getValue()>1).map(Map.Entry::getKey).findFirst().orElse(null);
    }
}
