// Last updated: 9/3/2026, 9:05:18 AM
1class Solution {
2    public List<String> findRepeatedDnaSequences(String s) {
3        Set<String> seen=new HashSet<>();
4        Set<String>repeated=new HashSet<>();
5        for(int i=0;i<=s.length()-10;i++){
6            String cur=s.substring(i,i+10);
7            if(seen.contains(cur))repeated.add(cur);
8            else seen.add(cur);
9        }
10        return new ArrayList<>(repeated);
11    }
12}