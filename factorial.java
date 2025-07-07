import java.util.*;
class factorial{
    public static void main(String[] args){
        int n=4;
        int result=fact(n);
        System.out.println(result);
    }
    public static int fact(int n){
        if(n==1) return 1;
        return n*fact(n-1);
    }
}