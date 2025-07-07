import java.util.*;
class Recursion4{
    public static void main(String[] args){
        int n=10;
     int[] arr={1,2,3,4,5,6,7,8,9,0};
     arrby2(arr,n);

    }
     public static void arrby2(int[] arr, int n){
        if(n==0){
            return;
        }
        else{
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    arrby2(arr, n/2);
     }
}