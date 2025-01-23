//tablulation is a bottom up approach base case to the required case
// class Solution{
//     public static void main(String[] args) {
//         int n=8;
//         int[] dp=new int[n+1];
//         dp[0]=0;
//         dp[1]=1;
//         for(int i=2;i<=n;i++){
//             dp[i]=dp[i-1]+dp[i-2];
//         }
//         System.out.println(dp[5]);
//     }
// }

//optimized for the space , why need an array to store , just two previous values are enough
class Solution{
    public static void main(String[] args) {
        int n=7;
        int prev1=0;
        int prev2=1;
        for(int i=2;i<=n;i++){
            int curr=prev1+prev2;
            prev1=prev2;
            prev2=curr;
        }
        System.out.println(prev2);
    }
}