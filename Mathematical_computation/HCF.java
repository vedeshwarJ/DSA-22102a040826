
import java.util.*;
class HCF {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int hcf=getHcf(a,b);
        int lcm=lcm(hcf,a,b);
        System.out.println("HCF : "+hcf);
        System.out.println("LCM : "+lcm);
        sc.close();
        
    }
    public static int getHcf(int a, int b){
        if(a==0) return 0;
        else return (b==0)?a:getHcf(b,a%b);
    }
    public static int lcm(int hcf, int a,int b){
        int lcm=(a*b)/hcf;
        return lcm;
    }
}