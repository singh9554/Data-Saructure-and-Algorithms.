package Advanced_Java;
interface DemoAno{
  void meth1();
//  void meth2();
}
public class AnonymousClassAndLambdaExpression {
    public static void main(String[] args) {
        //This is an Anonymous class where we will not create any extra class to call the method just will create the
        //reference of interface and this will override It's method for temporary use and this is called
        //Anonymous Class;
//        DemoAno obj = new DemoAno() {
//            @Override
//            public void meth1() {
//                System.out.println("This is meth 1");
//            }
//
//            @Override
//            public void meth2() {
//                System.out.println("This is meth 2");
//            }
//        };
//        obj.meth1();
//        obj.meth2();
        //--------------------------------------------------------------------------------------
         //Lambda Expression
        DemoAno obj = ()->{
            System.out.println("This is the Lambda Expression, Here It is how it is created and always remember "+
                 "Lambda expression can be used with interface which has only one Method"   );
        };
        obj.meth1();
    }
}
