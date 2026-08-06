class Solution {
    public int[] leftRightDifference(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        int[]ans=new int[nums.length];
        int lsum=0;
        for(int i=0;i<nums.length;i++){
            int rsum=sum-lsum-nums[i];
            ans[i]=Math.abs(lsum-rsum);
            lsum+=nums[i];
        }
        return ans;
    }
}