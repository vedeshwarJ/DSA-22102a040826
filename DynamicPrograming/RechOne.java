import java.util.*;
class RechOne{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(count(n,dp));
        sc.close();
    }
    public static int count(int n,int[] dp){
        if(n==1) return 0;;
        if(dp[n]!=-1) return dp[n];
        int res=count(n-1,dp);
         if(n%2==0) {
            res=Math.min( res,count(n/2,dp));
        }
         if(n%3==0) {
            res=Math.min( res,count(n/3,dp));
        }
        return dp[n]=1+res;
    }
    
}