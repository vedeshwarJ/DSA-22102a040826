import java.util.*;
class numberofdigtsDP{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        System.out.println(count(n,count));
        sc.close();
    }
    public static int count(int n,int count){
        if(n==0) return count;
        count++;
        return count(n/10,count);
    }
}