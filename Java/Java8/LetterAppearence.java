 import java.util.*;
 import java.util.stream.*;
  import java.util.stream.Collectors;
 class LetterAppearence {
	public static void main(String []args) {
		System.out.println("Hello");
		String name = "YATHISH SHANKAR POOJARY";
		Map<Character, Long> mappedValues = name.chars().mapToObj(o-> (char) o).collect(Collectors.groupingBy( c->c ,Collectors.counting()));
		System.out.println(mappedValues);
	}
}