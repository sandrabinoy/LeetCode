class Solution {
    public int mostWordsFound(String[] sentences) {
        
        int maxWord = 0;
        for (int i = 0; i < sentences.length; i++) {
            int count = 1;
            for (int j = 0; j < sentences[i].length(); j++) {
                if (Character.isWhitespace(sentences[i].charAt(j))) {
                    count++;
                }
            }
            if (count > maxWord) {
                maxWord = count;
            }
        }
        return maxWord;
    }
}