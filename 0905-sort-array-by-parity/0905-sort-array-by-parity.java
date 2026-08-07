class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int i=0;
        int j=nums.length-1;
        for(int k=0;k<nums.length;k++){
            if(nums[i]%2!=0){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j--;
            }
            else{
                i++;
            }
        }
        return nums;
        
    }
}