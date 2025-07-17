import java.util.*;
class nonConsecutiveOnes{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(bin(n,dp));
        sc.close();
    }
    public static int bin(int n,int[] dp){
        if(n==1) return 2;
        if(n==2) return 3;
        if(dp[n]!=-1) return dp[n];
        return dp[n]=bin(n-1,dp)+bin(n-2,dp);
    }
    
} 