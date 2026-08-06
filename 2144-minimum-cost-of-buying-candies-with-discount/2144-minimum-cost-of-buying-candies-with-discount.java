class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int maxcost=0;
        for(int i=cost.length-1;i>=0;i-=3){
            maxcost+=cost[i];
            if(i-1>=0){
                maxcost+=cost[i-1];
            }
        }
        return maxcost;
    }
}