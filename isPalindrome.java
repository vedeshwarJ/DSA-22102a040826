import java.util.*;
class isPalindrome{
    public static void main(String[] args){
        String s="racecar";
        int n=s.length();
        int i=0;
        System.out.print(check(s,n,i));

    }
    public static Boolean check(String s,int n,int i){
      if(i>=n/2) return true;
      if(s.charAt(i)==s.charAt(n-1-i)) return check(s,n,i+1);
      return false;
    }
}