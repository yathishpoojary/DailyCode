package StreamsPractice;

import java.util.Arrays;

public class SortPracitce {
    public static void main(String[] args) {
        int []arr= {9,3,2,5,1,32,4,5,77,43,2,0};

        int swap = 0;
        for (int i = 0 ; i< arr.length-1; i++) {

            int minValue = i;
            for(int j = i+1;j< arr.length; j++) {
                if(arr[minValue] > arr[j] ){
                    minValue = j;
                }
            }

            if(minValue!= i) {
                int temp = arr[minValue] ;
                arr[minValue] = arr[i];
                arr[i] = temp;
                swap++;
            }
        }

        System.out.println(" swaps "+swap);
        System.out.println("Sort "+ Arrays.toString(arr));
    }
}
