import java.util.*;
class FractionalKnapsack{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the capacity of knapsack");
        int capacity=sc.nextInt();
        System.out.println("Enter the number of items");
        int m=sc.nextInt();
        int[] weight=new int[m];
        int[] profit=new int[m];
        System.out.println("Enter the weights");
        for(int i=0;i<m;i++){
            weight[i]=sc.nextInt();
          }
        System.out.println("Enter the profits");
        for(int i=0;i<m;i++){
            profit[i]=sc.nextInt();
        }
         
        int[] fraction=new int[m];
        for(int i=0;i<m;i++){
            int x=profit[i]/weight[i];
            fraction[i]=x;
        }
        
         int maxprofit=0;
         while(capacity!=0){
             int max=0;
         int ind=0;
        for(int i=0;i<m;i++){
            if(max<fraction[i]){
                max=fraction[i];
                ind=i;
            }
        }

        if(weight[ind]<=capacity){
            capacity=capacity-weight[ind];
            maxprofit=maxprofit+profit[ind];
        }
        else{
            int fractionprofit=capacity*fraction[ind];
            maxprofit=maxprofit+fractionprofit;
            capacity=0;
        }
        fraction[ind]=0;
       
    }
     System.out.println(maxprofit);
    sc.close();
  





    }
}