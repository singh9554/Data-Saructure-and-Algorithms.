package Exception_Handling;

public class Finally {
    static int Greet(){
        try{
            int a = 10;
            int b = 2;
            int c = a/b;
            return c;
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("Cleaning up Resources");
        }
        return -1;
    }
    public static void main(String[] args){
        System.out.println(Greet());
        int a = 10;
        int b = 5;
        while(true){
            try{
                System.out.println(a/b);
            }
            catch (Exception e){
                System.out.println(e);
                break;
            }
            finally{
                System.out.println("I m finally");
            }
            b--;
        }
        /*
        Note: Finally keyword: The statement that will be under the Finally block will get executed any cost it
        doesn't matter that there is exception in program it will run  ; It will run in any condition weather
        we break from the loop or return the statement in any case finally block will get executed at any cost
         */
    }
}
