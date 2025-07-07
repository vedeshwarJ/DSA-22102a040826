import java.util.*;
class Recursion3{
    public static void main(String[] args){
     int n=10;
    int sum= sumofn(n);
    System.out.print(sum);
    }
    public static int sumofn(int n){
        if(n>=0){
        return n+sumofn(n-1);
        }else{
       return 0;
        }
    }
}