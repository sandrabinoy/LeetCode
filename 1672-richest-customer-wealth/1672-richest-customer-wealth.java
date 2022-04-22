class Solution {
    public int maximumWealth(int[][] accounts) {
        
        int sum = 0;
        for (int i = 0; i < accounts.length; i++) {
            int tempSum = 0;
            for (int j = 0; j < accounts[i].length; j++){
                tempSum += accounts[i][j];
            }
            if (tempSum > sum) {
                sum = tempSum;
            }
        }
        return sum;
    }
}