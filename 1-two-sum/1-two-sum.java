class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int[] returnVal = new int[2];
        
        start:
        
        for(int i = 0; i < nums.length; i++){
            
            for(int j = i+1; j < nums.length; j++){
                
                if((nums[i]+nums[j]) == target){
                    
                    returnVal[0] = i;
                    returnVal[1] = j;
                    break start;
                    
                }
                
            }
            
        }
        
        return returnVal;
        
    }
}