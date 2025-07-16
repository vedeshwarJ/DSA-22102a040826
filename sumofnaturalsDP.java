import java.util.*;
class sumofnaturalsDP{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(sum(n,dp));
        sc.close();
    }
    public static int sum(int n,int[] dp){
        if(n<=1) return n;
        if(dp[n]!=-1) return dp[n];
        return n+sum(n-1,dp);
    }
}