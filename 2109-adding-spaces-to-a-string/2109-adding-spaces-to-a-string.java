class Solution {
    public String addSpaces(String s, int[] spaces) {
        
        StringBuilder result = new StringBuilder();
        int ptr = 0;
        
        for (int i = 0; i < spaces.length; i++) {
            
            int curr = spaces[i];
            result.append(s.substring(ptr, curr) + " ");
            ptr = curr;
            
        }
        
        result.append(s.substring(ptr, s.length()));
        
        return result.toString();
        
    }
}



/**
Enjoy               Your            Coffee, [5, 9]
|||||               ||||            ||||||
ptr = 0
str[] = {Enjoy , Your , }

*/