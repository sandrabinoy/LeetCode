class Solution {
    public String addSpaces(String s, int[] spaces) {
        
        String[] str = new String[spaces.length + 1];
        StringBuilder result = new StringBuilder();
        int ptr = 0;
        
        for (int i = 0; i < spaces.length; i++) {
            
            int curr = spaces[i];
            str[i] = s.substring(ptr, curr) + " ";
            ptr = curr;
            
        }
        
        str[spaces.length] = s.substring(ptr, s.length());
        for (String string : str) {
            result.append(string);
        }
        
        return result.toString();
        
    }
}



/**
Enjoy               Your            Coffee, [5, 9]
|||||               ||||            ||||||
ptr = 0
str[] = {Enjoy , Your , }

*/