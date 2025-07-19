import java.util.*;
class NQueensBasic{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] board=new int[n][n];
        boolean flag=true;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]=sc.nextInt();
            }
        }
        for(int i=1;i<n;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]==1){
                    for(int x=i-1;x>=0;x--){
                        if(board[x][j]==1){
                            flag=false;
                            break;
                        }
                    }
                    for(int x=i-1,y=j-1;x>=0 && y>=0;x--,y--){
                        if(board[x][y]==1){
                            flag=false;
                            break;
                        }
                    }
                    for(int a=i-1,b=j+1; a>=0 && b<n;a--,b++){
                            if(board[a][b]==1){
                               flag=false;
                               break;
                        }
                    }
                    }

                }
            }
        
        System.out.println((flag)? "Valid Board" :"invalid Board");
        sc.close();
    }
}