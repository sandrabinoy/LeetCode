class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        int len = nums.length;
        //If the array has only element
        if (len < 2) {
            return false;
        }
        
        HashSet<Integer> set = new HashSet<>();
        
        for (int i = 0; i < len; i++) {
            
            int val = nums[i];
            if (set.contains(val)) {
                return true;
            }
            set.add(val);
            
        }
        return false;
        
    }
}