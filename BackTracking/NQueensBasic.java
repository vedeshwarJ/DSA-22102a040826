import java.util.*;
class NQueensBasic{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=8;
        int[][] board=new int[n][n];
        boolean flag=true;
        board[0][0]=1;
        board[1][4]=1;
        board[2][7]=1;
        board[3][5]=1;
        board[4][2]=1;
        board[5][6]=1;
        board[6][1]=1;
        board[7][3]=1;
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
        
        System.out.println(flag);
        sc.close();
    }
}