import java.util.*;
class SumOfArray{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter the number of elements in array :");
        int n=sc.nextInt();
       
        int[] ar1=new int[n];
        int[] ar2=new int[n];
        int[] ar3=new int[n];
        
        System.out.println("enter the elements in ar1");
        for(int i=0;i<5;i++){
            ar1[i]=sc.nextInt();
        }
        System.out.println("enter the elements in ar2");
        for(int i=0;i<5;i++){
            ar2[i]=sc.nextInt();
        }
        for(int i=0;i<5;i++){
            ar3[i]=ar2[i]+ar1[i];
        }
        System.out.println("the elements in the third array is : ");
        for(int i=0;i<5;i++){
            System.out.print(ar3[i]+" ");
        }
    }
}