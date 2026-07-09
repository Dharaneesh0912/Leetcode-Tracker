// Last updated: 7/9/2026, 3:05:43 PM
class Solution {
    public int differenceOfSum(int[] nums) {
        int sum1=0;
        int sum2=0;
        for(int x:nums){
            sum1+=x;
            while(x!=0){
                sum2+=x%10;
                x/=10;
            }
        }
        return Math.abs(sum1-sum2);
        
    }
}