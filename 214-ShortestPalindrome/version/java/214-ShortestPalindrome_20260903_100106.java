// Last updated: 9/3/2026, 10:01:06 AM
1class Solution {
2    public List<String> summaryRanges(int[] nums) {
3       ArrayList<String> al=new ArrayList<>();
4        
5        for(int i=0;i<nums.length;i++){
6            int start=nums[i];
7            while(i+1<nums.length && nums[i]+1==nums[i+1])
8                i++;
9            
10            if(start!=nums[i]){
11                al.add(""+start+"->"+nums[i]);
12            }
13            else{
14                al.add(""+start);
15            }
16        }
17        return al;
18    }
19}