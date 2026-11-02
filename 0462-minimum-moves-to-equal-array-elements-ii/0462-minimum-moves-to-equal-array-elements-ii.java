class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int change = nums[nums.length / 2];
        int ans = 0;
        for (int num : nums) {
            ans += Math.abs(change - num);
        }
        return ans;
    }
}