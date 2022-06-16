class Solution {
    public boolean isSubsequence(String s, String t) {
        
        if (s == null || s.length() == 0) {
            return true;
        }
        if (t == null || t.length() == 0) {
            return false;
        }
        
        int j = 0;
        for (int i = 0; i < t.length(); i++) {
            
            char curr = t.charAt(i);
            if (j == s.length()) {
                break;
            }
            if (s.charAt(j) == curr) {
                j++;
            } 
            
        }
                
        return j == s.length();
        
    }
}