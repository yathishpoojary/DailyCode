package JuneMonthFirst;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterNameStartsWIthA {
    public static void main(String[] args) {
        String []st = {"Raju ", "Boju","Aju","Baju"};

      List val=    Arrays.stream(st).filter(f-> f.startsWith("A")).collect(Collectors.toList());

      System.out.println(val);

    }
}
