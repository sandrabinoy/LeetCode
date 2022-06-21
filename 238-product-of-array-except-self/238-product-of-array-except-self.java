class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int len = nums.length;
        int[] result = new int[len];
        int val = 1;
        for (int i = 0; i < len; i++) {
            
            result[i] = val;
            val *= nums[i];
            
        }
        
        val = 1;
        for (int i = len - 1; i >= 0; i--) {
            
            result[i] *= val;
            val *= nums[i];
            
        }
        
        return result;
        
    }
}