// Last updated: 7/9/2026, 3:10:01 PM
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int n1 = nums1.length;
        int n2 = nums2.length;
        int n = n1 + n2;

        int ind2 = n / 2;
        int ind1 = ind2 - 1;

        int i = 0, j = 0;
        int count = 0;

        int el1 = -1;
        int el2 = -1;

        while (i < n1 && j < n2) {
            int curr;

            if (nums1[i] < nums2[j]) {
                curr = nums1[i++];
            } else {
                curr = nums2[j++];
            }

            if (count == ind1) el1 = curr;
            if (count == ind2) el2 = curr;

            count++;
        }

        while (i < n1) {
            if (count == ind1) el1 = nums1[i];
            if (count == ind2) el2 = nums1[i];
            count++;
            i++;
        }

        while (j < n2) {
            if (count == ind1) el1 = nums2[j];
            if (count == ind2) el2 = nums2[j];
            count++;
            j++;
        }

        if (n % 2 == 1) return el2;

        return (el1 + el2) / 2.0;
    }
}