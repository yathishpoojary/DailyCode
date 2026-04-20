package Practice20th;
import java.util.*;
public class SecondHighestNumberFromList {
    public static void main(String[] args) {

        int arr[] = {10, 45, 23, 67, 89, 34};

        int val = Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).distinct().skip(1).findFirst().orElse(-1);
        System.out.println(" val "+val);
    }
}
