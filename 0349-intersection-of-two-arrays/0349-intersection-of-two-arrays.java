class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        int count = 0;
        for (int num : nums1) {
            set1.add(num);
        }
        int[] result = new int[nums1.length];
        for (int num : nums2) {
            if (set1.contains(num)) {
                result[count] = num;
                count++;
                set1.remove(num); 
            }
        }
        return Arrays.copyOf(result, count);
    }
}
