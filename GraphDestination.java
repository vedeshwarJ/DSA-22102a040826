import java.util.*;
public class GraphDestination{
    int[][] adjmatrix;
    int numVertices;
    public GraphDestination(int numVertices){
        this.numVertices=numVertices;
        adjmatrix=new int[numVertices][numVertices];
    }
    public void addEdges(int i,int j,int weight){
        adjmatrix[i][j]=weight;
    }
    public Boolean checking(int n,int p, int q, int v){
        int k=p;
        while(n>=0){
            for(int i=0;i<v;i++){
               if( adjmatrix[k][i]!=0){
                n=n-adjmatrix[k][i];
                k=i;
                break;
               }
            }
             if(n>=0 && k==q) return true;
        }
       
      return false;
    }

public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of vertices");
    int v=sc.nextInt();
    GraphDestination g=new GraphDestination(v);
    System.out.println("Enter the number of edges");
    int e=sc.nextInt();
    System.out.println("Enter the weight (start end weight)");
    for(int i=0;i<e;i++){
        int src=sc.nextInt();
        int dest=sc.nextInt();
        int weight=sc.nextInt();
        g.addEdges(src,dest,weight);
    }
    System.out.println("Enter the fuel, start and end");
    int n=sc.nextInt();
    int p=sc.nextInt();
    int q=sc.nextInt();
    System.out.print( g.checking(n,p,q,v));
     sc.close();
}

}
    