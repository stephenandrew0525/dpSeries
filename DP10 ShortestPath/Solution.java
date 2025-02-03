class ShortestPath{
    public int shortestPath(int[][] mat){
        int m=mat.length;
        int n=mat[0].length;
        int[] prev=new int[n];
        for(int i=0;i<m;i++){
            int[] temp =new int[n];
            for(int j=0;j<n;j++){
                if(i==0 && j==0){
                    temp[j]=mat[i][j];
                    continue;
                }
                else{
                    int up=mat[i][j];
                    if(i>0){
                        up+=prev[j];
                    }
                    else{
                        up+=Math.pow(10,9);
                    }
                    int left=mat[i][j];
                    if(j>0){
                        left+=temp[j-1];
                    }
                    else{
                        left+=Math.pow(10,9);
                    }
                    temp[j]=Math.min(up,left);
                }
            }
            prev=temp;
        }
        return prev[n-1];
    }
}
class Solution{
    public static void main(String[] args) {
        int[][] grid = {{1,3,1},{1,5,1},{4,2,1}};
        ShortestPath s=new ShortestPath();
        int ans=s.shortestPath(grid);
        System.out.println("the ans is: "+ ans);
    }
}