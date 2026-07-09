// Last updated: 7/9/2026, 3:08:06 PM
class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        if (Arrays.stream(gas).sum() < Arrays.stream(cost).sum()) {
            return -1;
        }
        
        int tank = 0, idx = 0;

        for (int i = 0; i < gas.length; i++) {
            tank += gas[i] - cost[i];
            if (tank < 0) {
                tank = 0;
                idx = i + 1;
            }
        }

        return idx;
    }
}