class Solution {
    public int minDeletions(String s) {
        
        int[] frequencies = new int[26];
        for (char c : s.toCharArray()) {
            frequencies[c - 'a'] ++;
        }
        
        Arrays.sort(frequencies);
        int deleteCount = 0;
        int maxFreqAllowed = s.length();
        
        for (int i = 25; i >= 0 && frequencies[i] > 0; i--) {
            if (frequencies[i] > maxFreqAllowed) {
                deleteCount += frequencies[i] - maxFreqAllowed;
                frequencies[i] = maxFreqAllowed;
            }
            maxFreqAllowed = Math.max(0, frequencies[i] - 1);
        }
        
        return deleteCount;        
        
    }
}