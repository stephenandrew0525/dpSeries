class HousRobber{
    public int houseRob(int[] arr){
        int n=arr.length;
        int[] dp1=new int[n];
        int[] dp2=new int[n];
        for(int i=0;i<n-1;i++){
            dp1[i]=-1;
        }
        for(int i=0;i<n-1;i++){
            dp2[i]=-1;
        }
        int[] temp1=new int[n-1];
        int[] temp2=new int[n-1];
        for(int i=1;i<n;i++){
            temp1[i-1]=arr[i];
        }
        for(int i=0;i<n-1;i++){
            temp2[i]=arr[i];
        }
        return Math.max(helper(temp1,dp1,temp1.length-1),helper(temp2,dp2,temp2.length-1));


    }
    public int helper(int[] arr,int[] dp,int ind){
        if(ind==0){
            return arr[ind];
        }
        if(ind<0) return 0;
        if(dp[ind]!=-1){
            return dp[ind];
        }
        int pick=arr[ind]+helper(arr,dp,ind-2);
        int notPick=0+helper(arr,dp,ind-1);
        return dp[ind]= Math.max(pick,notPick);
    }
}
class Solution{
    public static void main(String[] args) {
        HousRobber h=new HousRobber();
        int[] arr={1,2,3};
        int ans=h.houseRob(arr);
        System.out.println("the ans is: "+ans);

    }
}