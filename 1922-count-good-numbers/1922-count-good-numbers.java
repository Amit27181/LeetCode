class Solution {
     final static int m=(int)1e9+7;
     public long pow(long a,long b){
        if(b==0){
            return 1;
        }
        long  half=pow(a,b/2);
        long result =(half*half)%m;
        if(b%2==1){
            result=(result*a)%m;
        }
        return result;
     }
    public int countGoodNumbers(long n) {
        return (int)((pow(5,(n+1)/2) * pow(4,n/2)) % m);
        
    }
}