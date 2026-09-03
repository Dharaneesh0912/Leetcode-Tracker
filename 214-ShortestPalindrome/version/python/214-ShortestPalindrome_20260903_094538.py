# Last updated: 9/3/2026, 9:45:38 AM
1import heapq
2
3class Solution:
4
5    def findKthLargest(self, nums: List[int], k: int) -> int:
6        heap = []
7
8        for i in nums:
9            heapq.heappush(heap, -i)
10
11        while k > 1:
12            heapq.heappop(heap)
13            k -= 1
14
15        return -heap[0]