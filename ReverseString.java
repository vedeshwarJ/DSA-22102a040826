import java.util.*;
class ReverseString{
    public static void main(String[] args){
        StringBuilder s=new StringBuilder("hello");
        int n=s.length();
        int i=0;
        reverse(s,n,i);
        System.out.print(s);
    }
    public static void reverse(StringBuilder s,int n, int i){
           if(i>=n/2) return ;
           char temp=s.charAt(i);
           s.setCharAt(i,s.charAt(n-1-i));
           s.setCharAt(n-1-i,temp);
           reverse(s,n,i+1);
    }
}