import java.util.*;
class multiplication{
    public static void main(String[] args){
        int number=5;
        int n=3;
        cal(number,n,1);
    }
    public static void cal(int number,int n,int i){
        if(i==n+1) return;
        System.out.println(number+"*"+i+"="+number*i);
        cal(number, n,i+1);
    }
}