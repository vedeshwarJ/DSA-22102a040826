import java.util.*;
public class Graph{
    int[][] adjmatrix;
    int numVertices;

    public Graph(int numVertices){
        this.numVertices=numVertices;
        adjmatrix=new int[numVertices][numVertices];
    }
    public void addEdges(int i,int j,int weight){
        adjmatrix[i][j]=weight;
        
    }
    public void printGraph(){
        for(int i=0;i<numVertices;i++){
            for(int j=0;j<numVertices;j++){
                System.out.print(adjmatrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of vertices");
        int v=sc.nextInt();
        Graph g=new Graph(v);
        System.out.println("Enter number of edges: ");
        int e=sc.nextInt();
        System.out.println("Enter edges (source destination weight)");
        for(int i=0;i<e;i++){
            int src=sc.nextInt();
            int dest=sc.nextInt();
            int weight=sc.nextInt();
            g.addEdges(src,dest,weight);
        }
        g.printGraph();
        }
}