import java.util.*;
class Tribonacci{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(Tri(n,dp));
        sc.close();
    }
    public static int Tri(int n,int[] dp){
        if(n==1) return 0;
        if(n==0) return 0;
        if(n==2) return 1;
        if(dp[n]!=-1) return dp[n];
        return dp[n]=Tri(n-1,dp)+Tri(n-2,dp)+Tri(n-3,dp);
    }
    
}