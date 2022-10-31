package Object_Oriented_Programming;
  abstract class parent{
    parent(){
        System.out.println("This is a constructor");
    }
    void hello(){
        System.out.println("say hello");
    }
 abstract void greed();// Since Abstract method is created now make this class abstract;
}
class child extends parent{
      //It will throw error until we override the abstract method from the abstract class that is extends in child class
     @Override
    void greed(){
         System.out.println("Good Morning");
    }
    void greed2(){
        System.out.println("good afternoon");
    }
}
public class Abstruction {
    public static void main(String[] args) {
//        parent p = new parent();//It will throw an error because Java doesn't allow to create the object of,abstract class
    child c = new child();
    c.greed();
    c.greed2();
//    parent p = new child();//upcasting
//    p.greed();
//    p.hello();
    }
}
