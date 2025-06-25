import java.util.*;
class SwapPairs{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements :");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int i=0,j=n-1;
        while(i<j){
            int x=arr[i];
            arr[i]=arr[j];
            arr[j]=x;
            i++;
            j--;
        }

      for(int k=0;k<n;k++){
        System.out.println(arr[k]);
      }
    }
}