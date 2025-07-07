import java.util.*;
class zeroton{
    public static void main(String[] args){
        int n=5;
        dis(n);
    }
    public static void dis(int n){
        if(n==0) {System.out.print(0+" ");
        return; }
        dis(n-1);
        System.out.print(n+" ");
    }
}