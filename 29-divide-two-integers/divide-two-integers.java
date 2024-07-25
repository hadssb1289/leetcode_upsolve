class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        int sign = (dividend < 0) ^ (divisor < 0) ? -1 : 1;
        long ldividend = Math.abs((long) dividend);
        long ldivisor = Math.abs((long) divisor);
        long quotient = 0;
        while (ldividend >= ldivisor) {
            long temp = ldivisor;
            long multiple = 1;
            while (ldividend >= (temp << 1)) {
                temp <<= 1;
                multiple <<= 1;
            }
            ldividend -= temp;
            quotient += multiple;
        }
    
        if (sign == 1) {
            return quotient > Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) quotient;
        } else {
            return (int) (-quotient);
        }
    }
}