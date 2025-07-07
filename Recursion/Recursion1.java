import java.util.*;
class Recursion1{
    public static void main(String[] args){
      int n=1;
      printing(n);
    }
    public static void printing(int n){
        if(n<=10){
            System.out.print(n+" ");
            printing(n+1);
        }
    }

}