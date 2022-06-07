class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        if (n == 0) {
            return;
        }
        
        int insertIndex = nums1.length - 1;
        m--;
        n--;
        while (n >= 0) {
            if (m >= 0 && nums1[m] > nums2[n]) {
                nums1[insertIndex--] = nums1[m--];
            } else {
                nums1[insertIndex--] = nums2[n--];
            }
        }
        
    }
}