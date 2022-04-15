class Solution {
    public int fib(int n) {
        if (n <= 1) return n;
        
        int minusOne = 1;
        int minusTwo = 0;
        int fibonacci = 1; 
        int i = 2;
        
        while (i <= n){

            fibonacci = minusOne + minusTwo;
            minusTwo = minusOne;
            minusOne = fibonacci;
            i++;
        }
        return fibonacci;
    }
}