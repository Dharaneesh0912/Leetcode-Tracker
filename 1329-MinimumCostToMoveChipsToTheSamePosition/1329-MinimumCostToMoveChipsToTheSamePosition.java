// Last updated: 7/9/2026, 3:06:16 PM
class Solution {        
    public int minCostToMoveChips(int[] position) {
    
        int evenCount = 0;
        int oddCount = 0;

        // Count chips on even and odd positions
        for (int p : position) {
            if (p % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        // Minimum cost is the smaller of the two counts
        return Math.min(evenCount, oddCount);
    }

        
    
}