import java.util.*;
class power{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int n=sc.nextInt();
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);

        System.out.println(cal(x,n,dp));
        sc.close();
    }
    public static int cal(int x,int n,int[] dp){
        if(n==0) return 1;
        if(n==1) return x;
        if(dp[n]!=-1) return dp[n];
        return dp[n]=x*cal(x,n-1,dp);
    }
}