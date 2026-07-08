import java.util.stream.*;
import java.util.Map;
import java.util.Comparator;
import java.util.List;
//import java.util.Character;

class LetterAppearenceTest {
	public static void main(String []args) {
		System.out.println("Hello");
		String name = "Yathish Shankar Poojary";
		Map<Character, Long> mappedResult = name.chars().mapToObj(c-> (char) c).collect(Collectors.groupingBy(c->c, Collectors.counting()));
		System.out.println(" Result " + mappedResult);
		
		
		List<Long> res = mappedResult.values().stream().distinct().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println("Res " +res);
		
		if(res.size()>= 3 ) {
		long thirdHeightest = res.get(2);
		
		List<Character> finalResult = mappedResult.entrySet().stream().filter(f-> f.getValue() == thirdHeightest)
		.map(m-> m.getKey()).collect(Collectors.toList());
		System.out.println("Final Result "+finalResult);
		}
	}
	
}