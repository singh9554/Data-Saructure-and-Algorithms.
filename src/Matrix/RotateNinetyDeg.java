package Matrix;
public class RotateNinetyDeg {
    public static void main(String[] args) {
        int [][]arr={{1,2,3},
                     {4,5,6},
                     {7,8,9}};
        int r = 3;
        int c = 3;
//        rotate90deg(arr,r,c);
        rotate90Deg(arr,r,c);
        for(int i = 0; i < r; i++)
        {
            for(int j = 0; j < c; j++)
            {
                System.out.print(arr[i][j]+" ");
            }

            System.out.println();
        }
    }
//    static void rotate90deg(int [][]arr,int r,int c){
//        int [][]temp = new int [r][c];
//        for(int i = 0 ; i < r ; i++) {
//            for (int j = 0; j < c; j++) {
//                temp[r - j - 1][i] = arr[i][j];
//            }
//        }
//            arr = temp ;
//            for(int i = 0 ;i < r ; i++){
//                for(int j = 0; j < c; j++){
//                    System.out.print(arr[i][j]+" ");
//                }
//                System.out.println();
//            }
//    }
    //Efficient approach O(1) space complexity;
    //swap function to transpose the matrix
    static void swap(int [][]arr,int i, int j ){
        int temp = arr[i][j];
        arr[i][j]=arr[j][i];
        arr[j][i]=temp;
    }
    //swap function to reverse the matrix;
    static void swap2(int low,int high ,int i,int [][]arr){
        int temp = arr[low][i];
        arr[low][i]=arr[high][i];
        arr[high][i]=temp;
    }
    //first we have to  transpose the matrix;
    static void rotate90Deg(int[][]arr,int r , int c){
        for(int i = 0;i < r; i++) {
            for (int j = i + 1; j < c; j++) {
                swap(arr, i, j);
            }
        }
                for(int i = 0; i < r; i++) {
                    int low = 0;
                    int high = r - 1;
                    while (low < high) {
                        swap2(low, high, i, arr);
                        low++;
                        high--;
                    }
                }
            }
        }


