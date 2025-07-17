import java.util.*;
class Knapsack{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of items :");
        int n=sc.nextInt();
        int[] w=new int[n];
        int[] p=new int[n];
        System.out.println("Enter the weights :");
        for(int i=0;i<n;i++) w[i]=sc.nextInt();
        System.out.println("Enter the profits :");
        for(int i=0;i<n;i++) p[i]=sc.nextInt();
        System.out.println("Enter the knapsack capacity : ");
        int bag=sc.nextInt();
        int[][] table= new int[n+1][bag+1];
        for(int i=0;i<bag;i++){
            table[0][i]=0;
        }
        for(int i=0;i<n;i++){
            table[i][0]=0;
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=bag;j++){
                if(j>=w[i-1]){
                    table[i][j]=Math.max(table[i-1][j],p[i-1]+table[i-1][j-w[i-1]]);
                }
                else{
                    table[i][j]=table[i-1][j];
                }
            }
        }
        System.out.print("MAX PROFIT : "+table[n][bag]);
        sc.close();
    }
}