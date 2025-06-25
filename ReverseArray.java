import java.util.*;
class ReverseArray{
 public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the no of elements in the array");
     int n=sc.nextInt();
     int[] ar1=new int[n];
     int[] ar2=new int[n];
     System.out.println("Enter the elements");
     for(int i=0;i<n;i++){
         ar1[i]=sc.nextInt();
     }int x=n-1;
     for(int j=0;j<n;j++){
         ar2[j]=ar1[x];
         x--;
         
     }
     for(int i=0;i<n;i++){
         System.out.print(ar2[i]+" ");
     }
 }
    
    
}