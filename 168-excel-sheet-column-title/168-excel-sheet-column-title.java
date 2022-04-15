class Solution {
    public String convertToTitle(int n) {
        
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            int temp = (n - 1) % 26;
            sb.append((char)('A' + temp));
            n = (n - temp - 1) / 26;
        }
        return sb.reverse().toString();
        
    }
}