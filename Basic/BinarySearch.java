import java.util.*;
class BinarySearch{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the target element");
        int t=sc.nextInt();
        
        binary(arr,t);
    }
    public static void binary(int[] arr, int t){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
        int mid=start+(end-start)/2;
        if(arr[mid]==t){
            System.out.println(true+"Element found in position :"+mid);
            return;
        }
        else if(arr[mid]>t){
            end=mid-1;
        }else{
            start=mid+1;
        }
    }
  System.out.println("Element not found");
        
    }
}