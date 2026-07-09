// Last updated: 7/9/2026, 3:09:26 PM
class Solution {
public:
    int removeElement(vector<int>& nums, int val) {

        int k = 0;

        for (int i = 0; i < nums.size(); i++) {

            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }
};