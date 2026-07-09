// Last updated: 7/9/2026, 3:06:50 PM
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n  =nums.length;
      Stack<Integer> s = new Stack<>();
      int nextGreater[] = new int[n];
        for(int i=2*n-1;i>=0;i--){
            while(!s.isEmpty() && s.peek()<=nums[i%n]){
                s.pop();
            }
            if(i<n){
                if(s.isEmpty()){
                    nextGreater[i] = -1;
                } else {
                    nextGreater[i] = s.peek();
                }
            }
            s.push(nums[i%n]);
        }
        return nextGreater;
    }
}