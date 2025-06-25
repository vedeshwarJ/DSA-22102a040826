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
        System.out.println("Enter the target element");
        int t=sc.nextInt();
        ArrayList<Integer> arr1=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(arr[i]!=t) arr1.add(arr[i]);
        }
    System.out.println(arr1);
    }
}