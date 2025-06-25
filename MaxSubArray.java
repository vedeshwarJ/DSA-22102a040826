import java.util.*;
class MaxSubArray{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements :");
        int n=sc.nextInt();
        System.out.println("Enter the elements :");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the size of subarray");
        int k=sc.nextInt();
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<k;i++){
         sum+=arr[i];
        }
        max=sum;
        for(int i=k;i<n;i++){
            sum=sum-arr[i-k]+arr[i];
            max=Math.max(max,sum);
        }
        System.out.println(max);
    }
}