package Data_Structure;

import java.util.Scanner;
public class product_of_2D_array {
    public static void multiplication(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the size of matrix A: ");
        int r1=scan.nextInt();
        int c1=scan.nextInt();
        int [][]arr1=new int[r1][c1];
        System.out.println("Enter the element in Matrix A: ");
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[i].length;j++){
                arr1[i][j]=scan.nextInt();
            }

        }
        System.out.println("Enter the size of matrix B: ");
        int r2=scan.nextInt();
        int c2=scan.nextInt();
        int [][]arr2=new int[r2][c2];
        System.out.println("Enter the element in Matrix B: ");
        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr2[i].length;j++){
                arr2[i][j]=scan.nextInt();

            }

        }
        int [][]product=new int[r1][c2];

        for(int i=0;i<product.length;i++){
            for(int j=0;j<product[i].length;j++){
                for(int k=0;k<c1;k++){
                    product[i][j] +=arr1[i][k]*arr2[k][j];
                }

            }
        }
        System.out.println("The product of both the matrix A and B : ");
        for(int i=0;i<product.length;i++){
            for(int j=0;j<product[i].length;j++) {
                System.out.print(product[i][j]+" ");
            }
            System.out.println("");
            }
    }
    public static void main(String[]args){
            product_of_2D_array obj=new product_of_2D_array();
            obj.multiplication();
        }
}

