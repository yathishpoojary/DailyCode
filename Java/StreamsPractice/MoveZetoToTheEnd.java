package StreamsPractice;

import java.util.Arrays;

public class MoveZetoToTheEnd
{

    public static void main(String[] args){
    int []arr= {0,2,1,0,3,0,50,0,54,0,7};

    int nonZero = 0;
    for(int i = 0;i<arr.length;i++ ) {
        if(arr[i] !=0) {
            arr[nonZero] =arr[i];
            nonZero++;
        }
    }
    while(nonZero< arr.length) {
        arr[nonZero] = 0;
        nonZero++;
    }
    System.out.println(Arrays.toString(arr));

}
}
