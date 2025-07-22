import java.util.*;
class Armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arm=getarm(n,0,(int)Math.log10(n)+1);
        System.out.print((n==arm)?"number is a armstrong":"number is not a armstrong");
        sc.close();
        }
    public static int getarm(int n,int sum, int len){
        if(n==0) return sum;
        sum+=Math.pow(n%10,len);
        return getarm(n/10,sum,len);
    }
}