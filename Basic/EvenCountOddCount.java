import java.util.*;
class EvenCountOddCount{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of elements in array :");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int e=0;
        int o=0;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0) e++;
            else o++;
        }
        System.out.println("Even number elments :"+e);
        System.out.println("Odd number elements :"+o);
    }
}