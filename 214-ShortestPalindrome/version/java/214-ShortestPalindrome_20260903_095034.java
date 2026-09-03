// Last updated: 9/3/2026, 9:50:34 AM
1class Solution {
2    public boolean containsNearbyDuplicate(int[] nums, int k) {
3        Map<Integer, Integer> seen = new HashMap<>();
4
5        for (int i = 0; i < nums.length; i++) {
6            int val = nums[i];
7            if (seen.containsKey(val) && i - seen.get(val) <= k) {
8                return true;
9            }
10            seen.put(val, i);
11        }
12
13        return false;        
14    }
15}