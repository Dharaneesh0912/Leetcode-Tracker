# Last updated: 9/22/2026, 9:59:49 AM
1import math
2class Solution(object):
3    def arrangeCoins(self, n):
4        row=1
5        count=0
6        while n>=row:
7            n-=row
8            row+=1
9            count+=1
10        return count