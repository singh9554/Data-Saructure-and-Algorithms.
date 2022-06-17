//NQueen problem using Backtracking
package Backtracking;
public class NQueen {

   final static int N =5;

public static void main(String[] args) {
    QSolver();
}
static void printSolution(int[][] board){
    for(int i = 0 ; i < N;i++){
        for(int j = 0; j < N;j++){
            System.out.print(" "+ board[i][j]
                            +" ");

        } System.out.println();
    }
}
static boolean QueenSafe(int[][] board,int row, int col){
int i , j;
    /* Check this row on left side */
    for(i = 0;i<col;i++){
       if(board[row][i]==1){
           return false;
       }
    }
    /* Check upper diagonal on left side */
    for( i =row , j = col; j>=0 && i>=0;j--,i--){
        if(board[i][j]==1){
            return false;
        }
    }
    /* Check lower diagonal on left side */
    for(i = row , j = col; j>=0 && i<N;j--,i++){
        if(board[i][j]==1){
            return false;
        }
    }
    return true;
}
static boolean solveQueen(int [][]board,int row){
    if(row == N){
        return true;
    }
    for(int i = 0 ;i < N ;i++){
        if(QueenSafe(board,i,row)){
             board[i][row]=1;
             if(solveQueen(board,row+1)==true){
                 return true;
             }
             board[row][i]=0;
        }

    }
    return false;
}
static boolean QSolver(){
    int[][] board= {{0,0,0,0,0},
                    {0,0,0,0,0},
                    {0,0,0,0,0},
                    {0,0,0,0,0},
                    {0,0,0,0,0}};
    if(solveQueen(board,0)==false){
        return false;
    }
    printSolution(board);
    return true;
}
}
