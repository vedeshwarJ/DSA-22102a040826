import java.util.*;
class ntoone{
    public static void main(String[] args){
        int n=5;
        repeate(n);
    }
    public static void repeate(int n){
        if(n<0){
            System.out.print("Done");
            return;
        }
        System.out.print(n+" ");
        repeate(n-1);
       
    }
}