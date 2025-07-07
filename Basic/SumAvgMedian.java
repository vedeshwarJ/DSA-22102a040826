import java.util.*;
class SumAvgMedian{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of elements in array :");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("entert the elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        System.out.println("Sum :"+sum);
        System.out.println("Average :"+ (double)sum/n);
        Arrays.sort(arr);
        if(n%2!=0){
            System.out.println("Median is :"+arr[n/2]);
        }
        else{
            double m=(arr[n/2]+arr[(n/2)-1])/2;
            System.out.println("Median is :"+m);
        }
       
        
    }
}