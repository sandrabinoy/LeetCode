class Solution {
    public int reverse(int x) { return (x == 0) ? 0 : process(x, 0); }

    private int process(int x, int output) {
        if (output < Integer.MIN_VALUE/10 || output > Integer.MAX_VALUE/10) return 0;
        else if (x/10 == 0) return (output * 10) + (x % 10);
        else return process(x/10, (output * 10) + x % 10);
    }
}