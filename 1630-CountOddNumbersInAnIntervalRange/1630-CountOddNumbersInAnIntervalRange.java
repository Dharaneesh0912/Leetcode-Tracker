// Last updated: 7/9/2026, 3:06:10 PM
class Solution {
    public int countOdds(int low, int high) {
        int count=0;
        if (low%2==1){
             for(int i=low;i<=high;i+=2){
                count+=1;
                }
        }else{
             for(int i=(low+1);i<=high;i+=2){
                count+=1;
                }
        }
       
        return count;
        
    }
}