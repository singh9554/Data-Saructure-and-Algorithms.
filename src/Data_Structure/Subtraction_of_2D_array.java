package Data_Structure;

import java.util.Scanner;

public class Subtraction_of_2D_array {
    static int [][]arr1;
    static  int [][]arr2;
    public Subtraction_of_2D_array (){
        Scanner scan=new Scanner(System.in);
        arr1=new int[3][3];
        arr2=new int[3][3];
        System.out.println("Enter the element of Matrix A: ");
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[i].length;j++){
                arr1[i][j]=scan.nextInt();
            }
        }
        System.out.println("Enter the element of Matrix B: ");
        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr2[i].length;j++){
                arr2[i][j]=scan.nextInt();
            }
        }
    }
    public static void Subtraction(){
        int result[][]={{0,0,0},
                {0,0,0},
                {0,0,0}};
        System.out.println("Matrix A: ");
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[i].length;j++){
                System.out.print(arr1[i][j]+" ");
            } System.out.println("");
        }

        System.out.println("Matrix B: ");
        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr2[i].length;j++){
                System.out.print(arr2[i][j]+" ");
            }System.out.println("");
        }

        System.out.println("Print the result: ");
        for(int i=0;i<result.length;i++){
            for(int j=0;j<result[i].length;j++){
                result[i][j]=arr1[i][j]-arr2[i][j];
                System.out.print(result[i][j]+" ");
            } System.out.println("");
        }

    }

    public static void main(String[] args) {
        Subtraction_of_2D_array  obj=new Subtraction_of_2D_array ();
        obj.Subtraction();
    }
}
