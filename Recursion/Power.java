import java.util.*;
class Power{
    public static void main(String[] args){
        int base=2;
        int exp=4;
        int ans=1;
        System.out.print(mul(base,exp ,ans));
    }
    public static int mul(int base,int exp,int ans){
        if(exp==0) return ans;
        ans=ans*base;
        return mul(base,exp-1,ans);
    }
}