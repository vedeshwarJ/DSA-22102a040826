import java.util.*;
class Ntimes{
    public static void main(String[] args){
        int n=3;
        String s="Hi";
       repeate(s,n);
    }
    public static void repeate(String s,int n){
        if(n==0) return;
        System.out.print(s+" ");
        repeate(s,n-1);
    }
}