import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {

    public static List<List<String>> getGroupAnagrams(String[] input) {
        HashMap<String, List<String>>  map = new HashMap<>();

        for(String st: input) {
            char[] chars = st.toCharArray();
            Arrays.sort(chars);
            String newString = new String(chars);

            map.putIfAbsent(newString, new ArrayList<>());
          map.get(newString).add(st);

        }
        return new ArrayList<>(map.values());


    }

    public static void main(String[] args) {
        String[] input = {"eat", "tea","tan","nat","cdt"};
        System.out.println(getGroupAnagrams(input));
    }
}
