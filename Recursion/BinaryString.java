import java.util.*;
class BinaryString{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s="";
        result(n,s);
        sc.close();
    }
    public static void result(int n, String s){
        if(s.length()==n){
            System.out.println(s);
            return;
        }
        result(n,s+'0');
        result(n, s+'1');
    }
}