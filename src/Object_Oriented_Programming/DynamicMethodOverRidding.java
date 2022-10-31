package Object_Oriented_Programming;
class Phone{
    public void showTime(){
        System.out.println("Time is 8 am");
    }
    public void on(){
        System.out.println("Turning on Phone...");
    }
}

class SmartPhone extends Phone{
    public void music(){
        System.out.println("Playing music...");

    }
    @Override
    public void on(){
        System.out.println("Turning on SmartPhone...");

    }
}
public class DynamicMethodOverRidding {
    public static void main(String[] args) {
        // Phone obj = new Phone(); // Allowed
//         SmartPhone smObj = new SmartPhone(); // Allowed
        // obj.name();

        Phone obj = new SmartPhone();// This is also known as Upcasting // Yes it is allowed because we can make sub-Class Object with Super-Class
        // reference;
        //------------
//         SmartPhone obj2 = new Phone(); // Not allowed because we can't make sub-Class Object with Super-Class
        // reference;

        obj.showTime();//This is Allowed because we get access of all method of Super-Class;
        obj.on();//This method is overridden from Super Class to Sub-class And it will execute the sub-Class method
        //And not the Super-Class to Execute Super Class method use Super keyword to access the Super Class method ;
        //-----------
        // obj.music(); //Not Allowed because we create sub-Class Object with Super-Class reference and only the method
        //Available is Super-Class And The Method The has been overridden from Super-Class to Sub Class will be accessAble
        //And the method with is present in Sub-Class But not present is Super-Class will not be accessAble;
        //To execute it will have to  make sub-Class Object with Sub-Class reference;
        //Like this --> SmartPhone obj2 = new Phone();
    }

}
