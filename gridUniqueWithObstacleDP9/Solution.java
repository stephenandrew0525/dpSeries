class UniquePathWithObstacle{
    public int uniquePath(int[][] mat){
        int m=mat.length;
        int n=mat[0].length;
        int prev[]=new int[n];
        if(mat[0][0]==1) return 0;
        for(int i=0;i<m;i++){
            int temp[]=new int[n];
            for(int j=0;j<n;j++){
                if(i==0 && j==0){
                    temp[j]=1;
                    continue;
                }
                if(mat[i][j]==1){
                    temp[j]=0;
                    continue;
                }
                int up=0;
                int left=0;
                if(i>0){
                    up=prev[j];
                }
                if(j>0){
                    left=temp[j-1];
                }
                temp[j]=up+left;
            }
            prev=temp;
        }
        return prev[n-1];
    }
}
class Solution{
    public static void main(String[] args) {
        UniquePathWithObstacle u=new UniquePathWithObstacle();
        int[][] maze = {
            {0, 0, 0},
            {0, 1, 0},
            {0, 0, 0}
        };

       
        int ans=u.uniquePath(maze);
        System.out.println("the ans is : "+ans);
    }
}