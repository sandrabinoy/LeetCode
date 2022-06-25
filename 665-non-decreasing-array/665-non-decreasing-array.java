class Solution {
    public boolean checkPossibility(int[] nums) {
        
        int count = 0;
        
        for (int i = 1; i < nums.length; i++) {
            
            if (nums[i-1] > nums[i]) {
                count++;
                if(i-2<0 || nums[i-2] <= nums[i])
                    nums[i-1] = nums[i];    //If prev value is > current val, change the prev value.
                else 
                    nums[i] = nums[i-1];    //If last 2 values both are > current, change the current value.
            
            }
        }
        
        return count <= 1;
        
    }
}