import java.util.*;
class RemoveSpecials{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String :");
        String str=sc.nextLine();
        int n=str.length();
        String str1="";
        for(int i=0;i<n;i++){
            if((int)str.charAt(i)>=65 && (int)str.charAt(i)<=90){
                str1+=(str.charAt(i));
            }
            else if((int)str.charAt(i)>=97 && (int)str.charAt(i)<=122){
                str1+=(str.charAt(i));
        }
    }
    System.out.println(str1);
}
}