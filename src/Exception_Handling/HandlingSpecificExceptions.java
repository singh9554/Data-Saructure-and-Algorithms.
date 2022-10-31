package Exception_Handling;
import java.util.Scanner;
public class HandlingSpecificExceptions {
    public static void main(String[]args){
        int [] arr = new int[3];
        arr[0]=3;
        arr[1]=6;
        arr[2]=4;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the index of the array");
        int idx = sc.nextInt();
        System.out.println("Enter the number you want to divide with");
        int number = sc.nextInt();
        try{
            System.out.println("The number in that index is " + arr[idx]);
            System.out.println("The ans is "+arr[idx]/number);
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic Occured!");
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException  Occured! ");
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println("Some other Exception Occured!");
            System.out.println(e);
        }
        System.out.println("End of the Program");
    }
}
