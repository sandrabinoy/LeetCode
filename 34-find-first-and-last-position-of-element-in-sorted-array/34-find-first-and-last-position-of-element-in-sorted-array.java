class Solution {
    public int[] searchRange(int[] arr, int target) {
        
        int[] result = new int[]{-1, -1};
        
        if (arr.length == 0 || arr == null) {
            return result;
        }
        
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                if (index < 0) {
                    result[0] = i;
                }
                index = i;
            }
            if (index >= 0 && arr[i] != target) {
                result[1] = index;
                break;
            }
        }
        if (index >= 0) {
            result[1] = index;
        }
        
        return result;
        
    }
}