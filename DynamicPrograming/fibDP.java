import java.util.*;
class fibDP{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(fib(n,dp));
        sc.close();
    }
    public static int fib(int n,int[] dp){
        if(n<=1) return 1;
        if(dp[n]!=-1) return dp[n];
        return dp[n]=fib(n-1,dp)+fib(n-2,dp);
    }
}