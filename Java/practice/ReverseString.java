package practice;

public class ReverseString {


    public static void main(String []args)
    {
        String st = "Hello";

        StringBuilder stB = new StringBuilder(st);

        String newVal = stB.reverse().toString();

        System.out.println(" NewVal "+newVal);

        String newVal2 = "";

        for(int i =st.length()-1; i > -1; i--) {
            newVal2 += st.charAt(i);

        }

        System.out.println(" 2nd "+ newVal2);

    }}
