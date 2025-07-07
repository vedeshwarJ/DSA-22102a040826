import java.util.*;
class Elements{
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,7,8,9};
        int n=9;int i=0;
        printing(arr,i,n);

    }
    public static void printing(int[] arr,int i,int n){
        if(i<n){
            System.out.print(arr[i]+" ");
            printing(arr,i+1,n);
        }
    }
}