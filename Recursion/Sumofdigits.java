import java.util.*;
class Sumofdigits{
    public static void main(String[] args){
        int n=123;
        int sum=0;
        int s=sumf(n,sum);
        System.out.print(s);

    }
    public static int sumf(int n, int sum){
        if(n==0) return sum;
        int digit=n%10;
        sum=sum+digit;
        
        return sumf(n/10,sum);
        
    }
}