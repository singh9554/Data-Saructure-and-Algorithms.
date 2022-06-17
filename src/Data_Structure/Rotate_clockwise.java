package Data_Structure;

public class Rotate_clockwise {
    public static void main(String[] args) {

int [][]arr ={{1, 2, 3},
              {4, 5, 6},
              {7, 8, 9}};
int [][]temp={{0,0,0},
              {0,0,0},
              {0,0,0}};
        System.out.println("print the given Matrix");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }
          for(int i=0;i<arr.length;i++) {
              for(int j=0;j<arr[i].length;j++){
                 temp [i][j]=arr[j][i];
              }
          }
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=temp[i][j];
            }
        }
        System.out.println("Print the transpose Matrix: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }
    }
}