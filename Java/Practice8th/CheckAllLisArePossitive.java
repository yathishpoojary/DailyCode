package Practice8th;

import java.util.Arrays;
import java.util.List;

public class CheckAllLisArePossitive {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,1);
        boolean res = list.stream().allMatch(f-> f>0);
        System.out.println("Res "+res);
    }
}
