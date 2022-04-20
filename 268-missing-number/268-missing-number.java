class Solution {
    public int missingNumber(int[] nums) {
        
        int totalSum = nums.length;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            totalSum += i;
        }
        return totalSum - sum;
    }
}