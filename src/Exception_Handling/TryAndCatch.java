package Exception_Handling;
public class TryAndCatch {
    public static void main(String[] args){
        int a = 600;
        int b =0;
        //If we don't use try catch then the program will not go till last line because as we know that
        //That our Java Program runs line by line so the moment it will find exception it will not execute further;
        //Will throw exception;
        try{
            int c = a/b;
            System.out.println(c);
        }
      catch(Exception e){
          System.out.println("Program cannot run and the reason is ");
          System.out.println(e);
        }
        System.out.println("End Of The Program");
    }
}
