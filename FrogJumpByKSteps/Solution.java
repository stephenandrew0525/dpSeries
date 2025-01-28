import java.util.*;
class FrogJump{
    public int frogJump(int[] arr,int k){
        int[] dp=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            dp[i]=-1;
        }
        return helper(arr,k,dp,arr.length-1);
    }
    public int helper(int[] arr,int k,int[] dp,int index){
        if(index==0){
            return 0;
        }
        if(dp[index]!=-1){
            return dp[index];
        }
        int mmStep=Integer.MAX_VALUE;
        for(int j=1;j<=k;j++){
            if(index-j>=0){
            int jump=helper(arr,k,dp,index-j)+Math.abs(arr[index]-arr[index-j]);
            mmStep=Math.min(jump,mmStep);
            }
        }
        return dp[index]=mmStep;
    }
}
class Solution{
    public static void main(String[] args) {
        FrogJump f=new FrogJump();
       int[] arr={10,30,40,50,20};
       int ans=f.frogJump(arr, 3);
       System.out.println("the minimum path output is: "+ ans);
    }
}