class Solution {
    public boolean isPalindrome(String s) {
        
        String[] strArray = s.toLowerCase().split("[^a-zA-Z0-9]");
        int length = strArray.length;
        StringBuffer stringBuffer = new StringBuffer();

        for(int i = 0; i < length; i++) {
            stringBuffer.append(strArray[i]);
        }
        
        if(stringBuffer.toString().equals(stringBuffer.reverse().toString())) {
            return true;
        }
        
        return false;
        
    }
}