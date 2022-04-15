class Solution {
    public boolean isAnagram(String s, String t) {
        int a[]=new int[26];
        int count=0;
        if (s.length() != t.length()) {
            return false;
        }
        if (s.length() == 1 && t.length() == 1) {
            return s.charAt(0) == t.charAt(0);
        }
        for(int i = 0; i < t.length(); i++) {
            a[t.charAt(i)-'a']++;
            count++;
        }
        for(int j=0;j<=s.length()-1;j++) {
            if(a[s.charAt(j)-'a']!=0) {
                a[s.charAt(j) - 'a']--;
                count--;
            }
        }
        return count==0 ? true : false;
    }
}