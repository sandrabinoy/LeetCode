class Solution {
    public int singleNumber(int[] nums) {
        int num=0;
for(int i=0;i<nums.length;i++){
num=num^nums[i]; // e.g if 3^3=1 so the only unique element would remain
}
return num;
    }
}