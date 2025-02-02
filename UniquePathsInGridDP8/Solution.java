class UniquePath{
    public int uniquePath(int[][] mat,int m,int n){
       //here m and n are the destination address of the matrix
        int[] prev=new int[n];
        for(int i=0;i<m;i++){
            int temp[]=new int[n];
            for(int j=0;j<n;j++){
                if(i==0 && j==0 ){
                    temp[j]=1;
                    continue;
                }
                int up=0;
                int left=0;
                if(i>0) up=prev[j];
                if(j>0) left=temp[j-1];
                temp[j]=up+left;
            }
            prev=temp;
        }
        return prev[n-1];
    }
}
class Solution{
    public static void main(String[] args) {
        int[][] mat =new int[3][7];
        int m=3;int n=7;
        UniquePath u=new UniquePath();
        int ans=u.uniquePath(mat, m, n);
        System.out.println("the unique paths are:"+ ans);
    }
}