import java.util.*;
class sumofnaturals{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(Sum(n,dp));
        sc.close();
    }
    public static int Sum(int n,int[] dp){
        if(n<=1) return n;
        if(dp[n]!=-1) return dp[n];
        return dp[n]=n+Sum(n-1,dp);
    }
}