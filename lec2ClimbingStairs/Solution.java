//just three simple things , represent the parameter in terms of indexes , do stuff 
// on the condition and if asked to find the total no. of ways then add it 
//this can also be transformed to optimized one by keeping an array or two pointer to store the ans of each index

import java.util.*;
class Climb{
    public int climbingStairs(int n){
        if(n<=1) return 1;
        if(n==2) return 2;
        int prev=climbingStairs(n-1);
       int prev2= climbingStairs(n-2);
       return prev+prev2;
    }
}



class Solution{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        Climb c=new Climb();
        int ans=c.climbingStairs(n);
        System.out.println(ans);

        
    }
}