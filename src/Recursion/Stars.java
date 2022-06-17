//Practise of Patterns and Bubble Sort;
package Recursion;
public class Stars {
    public static void main(String[] args) {
       Pattern(5,0);
       Pattern2(5,0);
        System.out.println();
        System.out.println();
       int []arr={1,6,8,5,3};
       int n = arr.length-1;
       Bubble(arr,0,n);
        print(arr);
    }
    static void Pattern(int r, int c) {
        if(r == 0) return ;
        if(c < r){
            System.out.print("*"+" ");
            Pattern(r, c+1);
        }
        else {
            System.out.println();
            Pattern(r - 1, 0);
        }
    }
    static void Pattern2(int r, int c) {
        if(r == 0) return ;
        if(c < r){
            Pattern2(r, c+1);
            System.out.print("*"+" ");
        }
        else {
            Pattern2(r - 1, 0);
            System.out.println();
        }
    }
    static void Bubble(int[] arr,int i ,int n){
    if (n == 0 || n == 1) return;
    for( ;i < n;i++){
        if(arr[i]>arr[i+1]){
            int temp = arr[i+1];
            arr[i+1]=arr[i];
            arr[i]=temp;
        }

        }
        print(arr);
        System.out.println();
        Bubble(arr,0,n-1);
    }
    static void print(int []arr){
        for(int e : arr){
            System.out.print(e+" ");
        }
    }
}
