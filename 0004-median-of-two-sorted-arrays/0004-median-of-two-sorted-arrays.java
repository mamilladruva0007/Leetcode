class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int[] merged = new int[n + m];
        int i = n - 1;
        int j = m - 1;
        int k = n + m - 1;
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                merged[k--] = nums1[i--];
            } else {
                merged[k--] = nums2[j--];
            }
        }
        while (i >= 0) {
            merged[k--] = nums1[i--];
        }
        while (j >= 0) {
            merged[k--] = nums2[j--];
        }
        int total = n + m;
        if (total % 2 == 0) {
            return (merged[total / 2] + merged[total / 2 - 1]) / 2.0;
        } else {
            return merged[total / 2];
        }
    }
}
