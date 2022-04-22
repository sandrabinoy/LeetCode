class Solution {
    public int[] getConcatenation(int[] nums) {
        
        int[] concatArray = new int[nums.length * 2];
        for (int i = 0, j = 0; i < concatArray.length; i++) {
            if (i < nums.length) {
                concatArray[i] = nums[i];
            }
            else {
                concatArray[i] = nums[j++];
            }
        }
        return concatArray;
    }
}