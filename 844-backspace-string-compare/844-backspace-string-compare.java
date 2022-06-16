class Solution {
    public boolean backspaceCompare(String s, String t) {
        
        return buildString(s).equals(buildString(t));
        
    }
    
    public String buildString (String s) {
        
        Stack<Character> res = new Stack<>();
        for (Character c : s.toCharArray()) {
            if (c != '#') {
                res.push(c);
            } else if (!res.empty()){
                res.pop();
            }
        }
        
        return res.toString();
        
    }
}