// class Solution {
//     public int smallestIndex(int[] nums) {
//         for(int i=0;i<nums.length;i++){
//             if(i%10==nums[i]){
//                 return i;
//             }
//         }
//         return -1;
//     }
// }
class Solution {
    public int smallestIndex(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (DS(nums[i]) == i) {
                return i;
            }
        }
        return -1;
    }
    private int DS(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
