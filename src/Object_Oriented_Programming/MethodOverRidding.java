package Object_Oriented_Programming;
class A{
    public void meth1(){
        System.out.println("I am method 1 of class A");
    }
    public void greet(){
        System.out.println("Good Morning");
    }
}
class B extends A{
    @Override// This annotation is recommended to import because it will show which method is override and also give
    //us error iF the method is not override but if we don't use the Annotation then no error would be shown.
    //hence it is recommended to use this Annotation;
    public void meth1() {
        System.out.println("I m method 1 of Class B");
        super.meth1();//Here super keyword help us to target the super class method in such class;
    }
    public void welcome(){
        System.out.println("Namaste");
    }
}
public class MethodOverRidding {
    public static void main(String[] args) {
       B obj = new B();
       obj.meth1();//meth1 is overridden form class A and B class meth method will run;
        obj.greet();//All the method of Class A will be accessAble from class B because class B extends class A
        obj.welcome();//This is a Class B method And it is accessAble as we have created B Class object;
        //And Advanced Concept regarding is discussed is Dynamic Method overridden Code Section;
    }

}
