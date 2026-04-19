package StreamsPractice;

import java.util.Arrays;

public class SortTheRecords {
    public static void main(String []args) {
        System.out.println("Hi ");
        int []arr = {1,9,6,4,2,3,4,5};

        int swap = 0;
        for(int i = 0; i< arr.length-1; i++) {

            int minIndex = i;
            for(int j = i+1; j < arr.length; j++) {
                if(arr[j]<arr[minIndex]){
                    minIndex = j;
                }}

                if(minIndex != i ) {
                    int temp = arr[i];
                    arr[i] = arr[minIndex];
                    arr[minIndex] = temp;
                    swap++;
                }

        }
        System.out.println(" arr "+ Arrays.toString(arr));
        System.out.println(" Swaps "+swap);
    }
}
