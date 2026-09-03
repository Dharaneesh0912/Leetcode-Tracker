// Last updated: 9/3/2026, 10:03:08 AM
1class Solution {
2    public boolean isPowerOfTwo(int n) {
3        if(n<=0) return false;
4        if(n==1) return true;
5        return (n%2==0) && isPowerOfTwo(n/2);
6    }
7}