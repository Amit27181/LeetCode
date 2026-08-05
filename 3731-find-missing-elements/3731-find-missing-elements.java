class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        List<Integer> element=new ArrayList<>();
        int j=0;
        for(int i=nums[0];i<nums[nums.length-1];i++){
            if(j<nums.length && i!=nums[j]){
                element.add(i);
            }else{
                j++;
            }
        }
        return element;
 }
}