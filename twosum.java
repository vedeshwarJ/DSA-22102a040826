import java.util.*;
class main{
    public static void main(String[] args){
         Scanner sc=new Scanner(System.in);
         System.out.println("enter the number of elements in array :");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the target sum :");
        int t=sc.nextInt();
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==t){
                    System.out.println(arr[i]+" "+arr[j]);
                
                    
                }
                
            }
        }
    }
}