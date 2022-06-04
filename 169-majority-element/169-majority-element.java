class Solution {
    public int majorityElement(int[] nums) {
        
        int majorEl = 0;
        int length = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < length; i++) {
            int curr = nums[i];
            if (map.containsKey(curr)) {
                map.put(curr, map.get(curr)+1);
            }
            else {
                map.put(curr, 1);
            }
        }
        
        for (int key : map.keySet()) {
            if (map.get(key) > length/2) {
                majorEl = key;
            }
        }
        return majorEl;
    }
}