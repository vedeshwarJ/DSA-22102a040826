import java.util.*;
class ClimbStairs{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        System.out.print(climb(n,dp));
        sc.close();
    }
    public static int climb(int n,int[] dp){
        if(n<=1) return 1;
        if(dp[n]!=-1) return n;
        return dp[n]=climb(n-1,dp)+climb(n-2,dp);
    }
}