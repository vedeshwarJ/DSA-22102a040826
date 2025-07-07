import java.util.*;
class Recursion5{
    public static void main(String[] args){
      int[] arr={10,20,30,40,50,60,70,80,90};
      int n=8;
      int i=0;
      Boolean result=sort(arr, n, i);
      System.out.println(result);
    }
    public static Boolean sort(int[] arr,int n,int i){
        if(i>=n) return true;
        if(arr[i]>arr[i+1]) return false;
           return sort(arr,n,i+1);

    }

}