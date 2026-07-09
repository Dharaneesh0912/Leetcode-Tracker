// Last updated: 7/9/2026, 3:07:55 PM
class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        return nums[n/2];


        
    }
}