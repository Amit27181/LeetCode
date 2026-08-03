class Solution {
    public void reverseString(char[] s) {
        int i=0;
        int j=s.length-1;
        char swap=' ';
        while(i<j){
            swap=s[i];
            s[i]=s[j];
            s[j]=swap;
            i++;
            j--;
        }
    }
}