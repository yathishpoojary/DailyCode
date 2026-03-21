import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static int[] getTwoSumResult(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {

            int value  = target - nums[i];
            if(map.containsKey(value)) {
                return new int[] {map.get(value), i};
            }
            map.put(nums[i],i);
        }

        return new int[] {0,0};
    }

    public static void main(String[] args) {

        int[] nums = {3,2,8,33, 7, 11, 15};
        int target = 9;

        int[] result = getTwoSumResult(nums,target);
        System.out.println(Arrays.toString(result));


    }
}
