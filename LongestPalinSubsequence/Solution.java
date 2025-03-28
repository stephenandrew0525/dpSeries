class LongestCommonPalinSubsequence{
    public int longestPalinsub(String s){
        int n=s.length();
        int[][] dp=new int[n+1][n+1];
        String rev=new StringBuilder(s).reverse().toString();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(s.charAt(i-1)==rev.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }
                else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[n][n];
    }
}
class Solution{
    public static void main(String[] args) {
        LongestCommonPalinSubsequence l=new LongestCommonPalinSubsequence();
        String s="agbcba";
        System.out.println(l.longestPalinsub(s));
    }
}