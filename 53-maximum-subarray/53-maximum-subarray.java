class Solution {
    public int maxSubArray(int[] nums) {
        
        int maxSum = nums[0], tempSum = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            
            if (tempSum >= 0) {
                tempSum += nums[i];
            }
            else {
                tempSum = nums[i];
            }
            
            if (tempSum > maxSum) {
                maxSum = tempSum;
            }
            
        }
        
        return maxSum;
        
    }
}