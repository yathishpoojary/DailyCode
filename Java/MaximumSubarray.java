public class MaximumSubarray {
    public static int maximumSubarray(int[] numbers) {
        int maxValue = numbers[0];
        int current = numbers[0];

        for( int i = 1; i < numbers.length; i ++) {
            current = Math.max(numbers[i], current+numbers[i]);
            maxValue = Math.max(maxValue,current) ;
        }

        return maxValue;
    }
    public static void main(String[] args) {
        int[] numbers= {2,3,-1,1,2,-1};
        System.out.println(" maximum array value  "+maximumSubarray(numbers));

    }
}
