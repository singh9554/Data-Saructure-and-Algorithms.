package Matrix;
public class PassingTwoDArraysAsArgumentsInJava {
    public static void main(String[] args) {
        int [][]arr={{7,8,9},{10,11,12}};
        print(arr);
    }
    static void print(int [][]arr){
        for(int i = 0 ; i < arr.length;i++){
            for(int j = 0 ; j < arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
