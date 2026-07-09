// Last updated: 7/9/2026, 3:09:23 PM
class Solution {
    public int divide(int dividend, int divisor) {

        // Handle overflow case
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        boolean negative = (dividend < 0) ^ (divisor < 0);

        long dvd = Math.abs((long) dividend);
        long dvs = Math.abs((long) divisor);

        long result = 0;

        // Subtract divisor using bit shifts
        while (dvd >= dvs) {
            long temp = dvs;
            long multiple = 1;

            while ((temp << 1) <= dvd) {
                temp <<= 1;
                multiple <<= 1;
            }

            dvd -= temp;
            result += multiple;
        }

        return negative ? (int) -result : (int) result;
    }
}