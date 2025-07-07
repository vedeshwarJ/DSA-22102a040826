import java.util.*;
class VowelsConsonants{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=sc.nextLine();
        String str1=str.toLowerCase();
        int n=str1.length();
        int v=0,cs=0;
        for(int i=0;i<n;i++){
            if((int)str1.charAt(i)>=97 && (int)str1.charAt(i)<=122){
              char c=str1.charAt(i);
                if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                  v++;
                }
                else cs++;
            }
        }
        System.out.println("Vowels :"+ v);
        System.out.println("Consonants :"+ cs);
    }
}