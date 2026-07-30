class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer>dublicate=new HashSet<>();
       for(int i=0;i<nums.length;i++){
        if(i>k){
            dublicate.remove(nums[i-k-1]);
        }
        if(!dublicate.add(nums[i])){
            return true;
            }
       } 
       return false;
    }
}