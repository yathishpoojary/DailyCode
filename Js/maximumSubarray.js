console.log(" Maximum Subarrya",getMaximumSubarray([2,3,-6,1,2,-1]))

function getMaximumSubarray(nums) {
    let maxVal = nums[0];
    let current = nums[0];

    for( let i = 1 ; i< nums.length; i++) {
        current = Math.max(nums[i], nums[i]+current);
        maxVal = Math.max(maxVal,current)

    }
    return maxVal;
}