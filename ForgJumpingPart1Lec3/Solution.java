//frog jumping question,it can jump upto 1 or 2 steps , it has to reach at the top with minm height difference
import java.util.*;
class Frog{
    public int frogJumping(int[] heights){
        int length=heights.length;
        int[] dp=new int[length+1];
        for(int i=0;i<=length;i++){
            dp[i]=-1;
        }
        return helper(heights,dp,length-1);

    }
    public int helper(int[] heights,int[] dp,int n){
        if(n==0){
            return 0;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        int jumpOne=helper(heights,dp,n-1)+Math.abs(heights[n]-heights[n-1]);
        int jumpTwo=Integer.MAX_VALUE;
        if(n>1){
             jumpTwo=helper(heights,dp,n-2)+Math.abs(heights[n]-heights[n-2]);
        }
        return dp[n]=Math.min(jumpOne,jumpTwo);
    }
}
class Solution{
    public static void main(String[] args) {
        Frog f=new Frog();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=sc.nextInt();
        int[] heights=new int[n];
        for(int i=0;i<n;i++){
            heights[i]=sc.nextInt();
        }
        int ans=f.frogJumping(heights);
        System.out.println("The minm is:"+ ans);
    }
}
