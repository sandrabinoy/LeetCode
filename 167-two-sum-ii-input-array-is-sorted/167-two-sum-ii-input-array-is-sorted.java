class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            
            int curr = numbers[i];
            int diff = target - curr;
            if (map.containsKey(diff)) {
                int x = i + 1;
                int y = map.get(diff);
                if (x < y) {
                    result[0] = x;
                    result[1] = y;
                } else {
                    result[0] = y;
                    result[1] = x;
                }
                return result;
            } else {
                map.put(curr, i+1);
            }
            
        }
        
        return result;
        
    }
}