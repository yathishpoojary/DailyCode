import java.util.*;

public class FirstNonRepeatedBasic {
    public static void main(String[] args) {
        String input = "swiss";

        Map<Character, Integer> charCount = new LinkedHashMap<>();
        System.out.println(" charCount : " + charCount);

        for (char c : input.toCharArray()) {
            System.out.println(c + " : " + charCount.getOrDefault(c, 0));
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        Character result = null;
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() == 1) {
                result = entry.getKey();
                break;
            }
        }

        System.out.println("First non-repeated character: " + result);
    }
}