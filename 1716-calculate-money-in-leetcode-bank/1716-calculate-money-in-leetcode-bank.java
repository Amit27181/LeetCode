class Solution {
    public int totalMoney(int n) {
        int amount=0;
        for(int i=0;i<n;i++){
            int weekpassed=i/7;
            int currentday=i%7;
            amount +=(weekpassed+1)+currentday;
        }
        return amount;
    }
}