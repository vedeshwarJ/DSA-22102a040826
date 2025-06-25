import java.util.*;
class main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Enter the number or elements :");
        int[] arr=new int[n];
        System.out.println("Enter the elements :");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }int max=arr[0];
        int min=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            if(arr[i]<min){
                min=arr[i];
            }
                
            }
        }
        System.out.println("Minimum element is :"+min);
        System.out.println("Maximum element is :"+max);
    }
}