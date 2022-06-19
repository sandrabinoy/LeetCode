class Solution {
    public boolean isPalindrome(String s) {
        
        String[] strArray = s.toLowerCase().split("[^a-zA-Z0-9]");
        int length = strArray.length;
        StringBuffer stringBuffer = new StringBuffer();
        String normalStr = "";

        for(int i = 0; i < length; i++) {
            stringBuffer.append(strArray[i]);
        }
        normalStr = stringBuffer.toString();
        stringBuffer.reverse();
        
        if(stringBuffer.toString().equals(normalStr)) {
            return true;
        }
        
        return false;
        
    }
}