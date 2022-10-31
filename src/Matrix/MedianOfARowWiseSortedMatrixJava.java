package Matrix;
import java.util.*;
public class MedianOfARowWiseSortedMatrixJava {
    public static void main(String[] args) {
    int [][]mat = {{3,4,5},
                   {2,9,10},
                   {4,10,13},
                   {5,6,7},
                   {1,12,19}};
    int r = 5;
    int c = 3;
//        System.out.println( median(mat,r,c));
        System.out.println(matMed(mat,r,c));
    }
    //Naive solution O(NlogN) space complexity of O(N);
    static int median(int [][]mat,int r,int c){
        int index = 0;
        int []arr=new int [ r * c ];
        for(int i = 0 ; i < r ; i++){
            for(int j = 0; j < c; j++){
                arr[index++]=mat[i][j];
            }
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int n = arr.length;
        int ans = arr[(n-1)/2];
        return ans;
    }
    //Binary Search solution of time complexity O(N LOG N);
    static public int matMed(int mat[][], int r ,int c)
    {
        int min = mat[0][0], max = mat[0][c-1];
        for (int i=1; i<r; i++)
        {
            if (mat[i][0] < min)
                min = mat[i][0];

            if (mat[i][c-1] > max)
                max = mat[i][c-1];
        }

        int medPos = (r * c + 1) / 2;
        while (min < max)
        {
            int mid = (min + max) / 2;
            int midPos = 0;
            int pos = 0;
            for (int i = 0; i < r; ++i){
                pos = Arrays.binarySearch(mat[i],mid);

                if(pos < 0)
                    pos = Math.abs(pos) - 1;


                else
                {
                    while(pos < mat[i].length && mat[i][pos] == mid)
                        pos += 1;
                }

                midPos = midPos + pos;
            }
            if (midPos < medPos)
                min = mid + 1;
            else
                max = mid;
        }
        return min;
    }
}
