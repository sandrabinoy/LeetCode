class Solution {
    public int mostWordsFound(String[] sentences) {
        
        int maxWord = 0;
        for (String s : sentences) {
            int count = 1;
            for (int j = 0; j < s.length(); j++) {
                if (Character.isWhitespace(s.charAt(j))) {
                    count++;
                }
            }
            maxWord = count > maxWord ? count : maxWord;

        }
        return maxWord;
    }
}