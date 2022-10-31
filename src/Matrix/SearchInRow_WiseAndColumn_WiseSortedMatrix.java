package Matrix;
public class SearchInRow_WiseAndColumn_WiseSortedMatrix {
    public static void main(String[] args) {
       int [][] mat ={{10,20,30,40},
                      {15,25,35,45},
                      {27,29,37,48},
                      {32,33,39,50}};
       int r = 4;
       int c = 4;
       int x = 29;
//      search(mat,r,c,x);
        opSearch(mat,r,c,x);
    }
    //Naive approach Time complexity O(r * c)
//    static void search(int [][] mat, int r, int c, int x){
//        for(int i = 0; i < r; i++) {
//            for (int j = 0; j < c; j++) {
//                if (x == mat[i][j]) {
//                    System.out.print(i + " " + j);
//                    return;
//                }
//            }
//        }
//            System.out.print("Not Found");
//
//    }
    //Efficient approach Time complexity O(r + c)
    static void opSearch(int[][]mat, int r , int c ,int x){
        int top =0;int right = c -1 ;
    if(x < mat[top][0]){
        System.out.print("Not Found");
        return;
    }
    else if(x > mat[r-1][right]){
        System.out.print("Not Found");
       return;
    }
        while(top < r &&  right >= 0){
            if(x == mat[top][right]){
                System.out.print("Found at : "+ top+" "+right);
                return;
            }
            else if(x < mat[top][right]){
                right--;
            }
            else{
                top++;
            }
        }
        System.out.print("Not Found");
    }
}
