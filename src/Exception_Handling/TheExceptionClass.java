package Exception_Handling;
import java.util.Scanner;
class MyException extends Exception{
    public String toString() {
     return "I m a string";
    }
    public String getMessage() {
        return "I m getting msg";
    }
}
public class TheExceptionClass {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    if(a<9){
        try{
            throw new MyException();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println(e.toString());
        }
    }
    }
}
