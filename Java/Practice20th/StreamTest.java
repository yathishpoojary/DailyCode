import java.util.List;
import java.util.Arrays;
import java.util.stream.*;
import java.util.Comparator;
import java.util.OptionalInt;

public class StreamTest {
	public static void main(String[] args) {
	List<String> list = Arrays.asList("Hello","My", "Name");
	System.out.println("Hello");

	String res = list.stream().collect(Collectors.joining());
	System.out.println(res);
	List<String> res2 = list.stream().map(String::trim).collect(Collectors.toList());
	System.out.println(res2);

	
	List<Integer> list2 = Arrays.asList(1000,2000,2200,200,4000,20);
	int max = list2.stream().max(Comparator.naturalOrder()).get();
	System.out.println(max);
	OptionalInt  max2 = list2.stream().mapToInt(Integer::intValue).max();
	System.out.println(max2);

}	
}