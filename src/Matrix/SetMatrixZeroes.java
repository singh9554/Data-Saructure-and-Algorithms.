package Matrix;
import java.util.*;
public class SetMatrixZeroes {
    public static void main(String[] args) {
int [][]  matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
setZeroes(matrix);
    }
    public static void setZeroes(int[][] matrix) {
int min = -2047483648;
int m = matrix.length;
int n = matrix[0].length;
for(int i = 0; i < m ; i++){
    for(int j = 0; j < n ;j++){
        if(matrix[i][j] == 0){
            for(int k = 0; k < n ; k++){
                if(matrix[i][k] != 0){
                    matrix[i][k]=min;
                }
            }
            for(int f = 0;f < m ; f++){
                if(matrix[f][j] !=0){
                    matrix[f][j] = min;
                }
            }
        }
    }
}
for(int i = 0; i < m ;i++){
    for(int j = 0;j<n ;j++){
        if(matrix[i][j] == min){
            matrix[i][j]=0;
        }
    }
}
for(int i = 0; i < m;i++){
    for(int j = 0; j < n ;j++){
        System.out.print(matrix[i][j]+" ");
    }
    System.out.println();
}
    }
}
