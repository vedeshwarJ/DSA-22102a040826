import java.util.*;
class 0ton{
    public static void main(String[] args){
        int n=5;
    }
    public static int dis(int n){
        if(n==0) return;
        dis(n-1);
        return n;
    }
}