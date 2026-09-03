// Last updated: 9/3/2026, 9:54:35 AM
1class Solution {
2    public int computeArea(int ax1, int ay1, int ax2, int ay2,
3                           int bx1, int by1, int bx2, int by2) {
4        int area1 = (ax2 - ax1) * (ay2 - ay1);
5        int area2 = (bx2 - bx1) * (by2 - by1);
6
7        int widthOverlap = Math.max(0, Math.min(ax2, bx2) - Math.max(ax1, bx1));
8        int heightOverlap = Math.max(0, Math.min(ay2, by2) - Math.max(ay1, by1));
9        int overlapArea = widthOverlap * heightOverlap;
10
11        return area1 + area2 - overlapArea;
12    }
13}