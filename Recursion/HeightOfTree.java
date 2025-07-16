import java.util.*;
class HeightOfTree{
      class Node{
         int data;
         Node left;
         Node right;
         public Node(int data){
            this.data=data;
         }
    }
    class BinaryTree{
        Node root;
    public  void insert(int data){
          root= insertrec(root,data);
    }
    public  Node insertrec(Node root, int data){
        if(root==null){
             return new Node(data);
        }
        else if(data<root.data){
            root.left=insertrec(root.left,data);
        }
        else if(data>root.data){
            root.right=insertrec(root.right,data);
        }
        return root;
    }

  
    public  int height(Node node){
        if(node==null ) return -1;
        return 1+Math.max(height(node.left),height(node.right));
    }
      }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of node");
        int n=sc.nextInt();
        HeightOfTree treeApp = new HeightOfTree();
      BinaryTree tree = treeApp.new BinaryTree();
        System.out.println("Enter the nodes");
        for(int i=0;i<n;i++){
            int m=sc.nextInt();
            tree.insert(m);
        }
       
       int height=tree.height(tree.root);
       System.out.println(height);
        sc.close();
    }
}