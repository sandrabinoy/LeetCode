class Solution {
    public int missingNumber(int[] nums) {
        
        Arrays.sort(nums);
        int n = 0;
        int totalSum = 0;
        if (nums[nums.length - 1] == nums.length) {
            n = nums[nums.length - 1];
        }
        else {
            return nums.length;
        }
        for (int i = 0; i < nums.length; i++) {
            totalSum += nums[i];
        }
        
        int sum = n * (n + 1) / 2;
        return sum - totalSum;
    }
}