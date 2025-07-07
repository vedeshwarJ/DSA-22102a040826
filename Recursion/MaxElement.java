import java.util.*;
class MaxElement{
    public static void main(String[] args){
        int[] arr={3,7,2,9,1};
        int i=0;
        int max=0;
        System.out.print(max(arr,i,max));
    }
    public static int max(int[] arr,int i,int max){
     if(i==arr.length) return max;
     max=Math.max(max,arr[i]);
     return max(arr,i+1,max);
     
    }
}