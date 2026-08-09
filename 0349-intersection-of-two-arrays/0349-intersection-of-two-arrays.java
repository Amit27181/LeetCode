class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
       HashSet<Integer> set = new HashSet<>();
        for (int num : nums1) {
            set.add(num);
        }
         HashSet<Integer> intersectionSet = new HashSet<>();
        for (int num : nums2) {
            if (set.contains(num)) {
                intersectionSet.add(num);
            }
        }
         int[] result = new int[intersectionSet.size()];
        int i = 0;
        for (int num : intersectionSet) {
            result[i++] = num;
        }
        return result;

    }
}