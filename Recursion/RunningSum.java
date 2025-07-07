import java.util.*;
class RunningSum{
    public static void main(String[] args){
        int n=4;
        int i=1;
        int sum=0;
        call(n,i,sum);
    }
    public static void call(int n,int i,int sum){
        if(i>n) return;
        sum+=i;
        System.out.print(i+" (call: "+sum+") ");
        call(n,i+1,sum);
        
    }
}