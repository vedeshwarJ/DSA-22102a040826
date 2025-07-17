import java.util.*;
class vowels{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string :");
        String st=sc.nextLine();
        String s=st.toLowerCase();
        int n=s.length();
        int[] dp=new int[n];
        int i=0;
        Arrays.fill(dp,-1);
        System.out.print(vowels(s,n,dp,i));
        sc.close();
        
    }
    public static int vowels(String s,int n,int[] dp,int i){
        if(i==n) return 0;
        char c=s.charAt(i);
        int val=(c=='a'|| c=='e' || c=='i' || c=='o' || c=='u')?1:0;
        if(dp[i]!=-1) return dp[i];
        return dp[i]=val+vowels(s,n,dp,i+1);
    }
}