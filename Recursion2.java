import java.util.*;
class Recursion2{
    public static void main(String[] args){
     int n=100;
     breakinghalf(n);
    }
    public static void breakinghalf(int n){
        if(n>0){
            System.out.print(n+" ");
            breakinghalf(n/2);
        }
    }
}