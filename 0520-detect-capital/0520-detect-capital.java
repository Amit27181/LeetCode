class Solution {
    public boolean detectCapitalUse(String word) {
        int up_c=0;
        for(int i=0;i<word.length();i++){
            if(Character.isUpperCase(word.charAt(i))){
                up_c++;
            }
        }
        if(up_c==word.length()||up_c==0){
            return true;
        }
        if(up_c==1 && Character.isUpperCase(word.charAt(0))){
            return true;
        }
        return false;

    }
}