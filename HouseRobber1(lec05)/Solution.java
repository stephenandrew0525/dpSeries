class HouseRobber{
    public int houseRobber(int[] arr){
        int n=arr.length;
        int dp[]=new int[n];
        for(int i=0;i<n;i++){
            dp[i]=-1;
        }
        return helper(arr,dp,n-1);
    }
    public int helper(int[] arr,int[] dp,int index){
        if(index<0){
            return 0;
        }
        int pick=arr[index]+helper(arr,dp,index-2);
        int notPick=0+helper(arr,dp,index-1);
        int ans=Math.max(pick,notPick);
        return ans;
    }
}
class Solution{
    public static void main(String[] args) {
        HouseRobber h=new HouseRobber();
        int[] arr={2,7,9,9,1};
        int ans=h.houseRobber(arr);
        System.out.println("the max is: "+ ans);
    }
}