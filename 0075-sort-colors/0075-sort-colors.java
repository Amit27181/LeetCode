class Solution {
    public void sortColors(int[] nums) {
        int C0=0;
        int C1=0;
        int C2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                C0++;
            }else if(nums[i]==1){
                C1++;
            }else{
                C2++;
            }
        }
        for(int i=0;i<C0;i++){
            nums[i]=0;
        }
        for(int i=C0;i<C0 +C1;i++){
            nums[i]=1;
        }
        for(int i=C0+C1;i<nums.length;i++){
            nums[i]=2;
        }
        
    }
}