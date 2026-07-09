// Last updated: 7/9/2026, 3:05:34 PM
class Solution {
    public int findClosest(int x, int y, int z) {
        return Math.abs(x-z)>Math.abs(y-z) ? 2 : Math.abs(x-z)==Math.abs(y-z) ? 0 : 1;
    }
}