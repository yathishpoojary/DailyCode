import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses {
    static boolean checkValidParanthesis(String brackets) {
        Stack stack = new Stack<>();

        HashMap<Character, Character> map = new HashMap<>();
        map.put('}', '{');
        map.put(']', '[');
        map.put(')', '(');

        for(char c: brackets.toCharArray()) {
            if(c =='(' || c=='{' || c=='[') {
                stack.push(c);
            }
            else {
                if(stack.isEmpty()|| stack.peek()!= map.get(c)) {
                    return false;
                }
                 stack.pop();
            }
        }
        return stack.isEmpty();
    }

    public static void main( String[ ] args ) {
        System.out.println(checkValidParanthesis("(){}[]"));;
        System.out.println(checkValidParanthesis("([{}])"));;
        System.out.println(checkValidParanthesis("([{{}])"));;

    }
}
