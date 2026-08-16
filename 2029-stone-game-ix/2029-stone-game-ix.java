class Solution {
    public boolean stoneGameIX(int[] stones) {
        int[]cnt=new int[3];
        for(int n:stones){
            cnt[n%3]++;
        }
            if(cnt[0]%2==0){
                return Math.min(cnt[1],cnt[2])>0;
            }
        return Math.abs(cnt[1]-cnt[2])>2;
    }
}