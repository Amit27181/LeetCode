class Solution {
    public boolean canAliceWin(int n) {
        int st=10;
        boolean aliceTurn=true;
        while(n>=st){
            n-=st;
            st--;
            aliceTurn=!aliceTurn;
        }
        return !aliceTurn;
    }
}