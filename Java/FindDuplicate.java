class FindDuplicate  {
    static int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];

        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
            System.out.println("Slow "+slow);
            System.out.println("Fast "+fast);
        }while (slow!=fast);

        slow = nums[0];
        while(slow!=fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;
    }
    public static void main(String[] args) {
        int[] nums = {1,1,4,5,3,1,7};
        System.out.println(findDuplicate(nums));
    }
}