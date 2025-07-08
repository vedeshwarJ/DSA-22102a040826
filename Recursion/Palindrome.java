import java.util.*;
class Palindrome{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int i=0;
        pal(s,i);
        sc.close();
    }
    public static void pal(String s, int i){
        if(i>=s.length()/2){
            System.out.print(true);
            return;
        }
        if(s.charAt(i)!=s.charAt(s.length()-1-i)){
            System.out.print(false);
            return;
        }
        pal(s,i+1);

    }
}