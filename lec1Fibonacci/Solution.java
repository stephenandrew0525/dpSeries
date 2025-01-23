//this is example of memoization , here TC is O(n) and SC is O(n)
class fibonacci{
    public int fibo(int dp[],int n){
        if(n<=1){
            return n;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        return dp[n]=fibo(dp,n-1)+fibo(dp,n-2);
    }

}
class Solution{
    public static void main(String[] args) {
        fibonacci fib=new fibonacci();
        int n=5;
        int dp[]=new int[n+1];
        for(int i=0;i<=n;i++){
            dp[i]=-1;
        }
       int ans= fib.fibo(dp, n);
       System.out.println(ans);
        
    }
}