class Solution {
    public int numJewelsInStones(String jewels, String stones){
        HashSet<Character> js=new HashSet<>();
        // boolean[] isJewels = new boolean[128];
        for(char ch: jewels.toCharArray()) {
            // isJewels[ch] = true;
            js.add(ch);
        }
        int count = 0;
        for(char ch : stones.toCharArray()) {
            // if(isJewels[ch]) {
            if (js.contains(ch))
                count++;
            }
            
        return count;
        }
}