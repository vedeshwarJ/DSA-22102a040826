import java.util.*;
class CountRecursiveCalls{
    public static void main(String[] args){
        int n=3;
        call(n);
    }
    public static void call(int n){
        if(n==0) return;
        call(n-1);
        System.out.print("call "+n+"  ");
    }
}