class Solution {
    public void moveZeroes(int[] nums) {
        
        int zeroCtr = 0;
        for (int i = 0, j = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j++] = nums[i];
            } else {
                zeroCtr++;
            }
            if (nums.length - j == zeroCtr) {
                while (j < nums.length) {
                    nums[j++] = 0;
                }
                break;
            }
        }
        
    }
}