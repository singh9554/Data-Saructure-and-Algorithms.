package Exception_Handling;
class NegativeException extends Exception{
    public String toString(){
        return "Area cannot be Negative";
    }
    public String toMessage() {
        return "Area cannot be Negative";
    }
}
public class ThrowAndThrows{
    static double Area(int r) throws NegativeException{
        if(r<0){
            throw new NegativeException();
        }
        double res = Math.PI*r*r;
        return res;
    }


    static int Divide(int a , int b)throws ArithmeticException{
     return a/b;
    }
    public static void main(String[] args){
        try{
//            System.out.println(Divide(5,2) );
            System.out.println(Area(4));
        }
        catch(Exception e){
            System.out.println(e);//if we don't call any method form  exception function we built The by default
            //ToString() method will get call;
        }
    }
}
