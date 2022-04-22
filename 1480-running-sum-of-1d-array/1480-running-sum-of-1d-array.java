class Solution {
    public int[] runningSum(int[] nums) {
        
        int n = nums.length;
        int[] runSum = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            runSum[i] = sum;
        }
        return runSum;
    }
}