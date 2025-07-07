import java.util.*;
class fibonacci{
    public static void main(String[] args){
        int n=6;
        System.out.println(display(n));
    }
    public static int display(int n){
        if(n==1)return 1;
        if(n==0) return 0;
        return display(n-1)+display(n-2);
    }
}