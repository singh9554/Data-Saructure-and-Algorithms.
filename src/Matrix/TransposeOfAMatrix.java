package Matrix;
public class TransposeOfAMatrix {
    public static void main(String[] args){
        int [][]arr={{1,2,3,4},
                     {5,6,7,8},
                     {9,10,11,12},
                     {13,14,15,16}};
        int m = 4;
        int n = 4;
//        transpose(arr,m,n);
        transposeMatrix(arr,m,n);
        for(int i = 0;i < m; i++){
            for(int j = 0; j < n; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    //This is a naive approach which take O(n)space complexity;
//    static void transpose(int [][]arr, int m, int n){
//        int [][] temp = new int[m][n];
//        for(int i = 0 ;i < m ;i++){
//            for(int j = 0 ; j < n; j++){
//                temp[j][i] = arr[i][j];
//            }
//        }
//        arr=temp;
//        for(int i = 0 ;i < m ;i++){
//            for(int j = 0 ; j < n; j++){
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }
//    }
    //Efficient solution which transpose the matrix in one traversal and takes constant extra space;
    static void swap(int [][]arr,int i,int j){
        int temp = arr[i][j];
        arr[i][j]=arr[j][i];
        arr[j][i]=temp;
    }
    static void transposeMatrix(int[][]arr,int r , int c){
        for(int i = 0;i < r; i++){
            for(int j = i + 1; j < c ; j++){
                swap(arr,i,j);
            }
        }

    }
}
