import java.util.*;
class StringLength{
    public static void  main(String[] args){
        String s="String";
        int count=0;
        int ans=length(s,count);
        System.out.print(ans);
    }
    public static int length(String s,int count){
       try{
        s.charAt(count);
        return 1+length(s,count+1);
       }
       catch(Exception e){
        return 0;

       }
    }
}