package MultiLevelThreading;
class MyThr extends Thread{
    //This is a constructor in Thread which takes String as a parameter;Visit documentation for more Constructor;
    public MyThr(String name){
        super(name);
    }
    public void run(){
        System.out.println("I m a thread");
    }
}
public class ConstructorInThread {
    public static void main(String[]args){
        MyThr obj = new MyThr("pankaj");
        obj.start();
        //These are method in Thread visit documentation for more method;
        System.out.println("The Id of this thread is : "+obj.getId());
        System.out.println("The name in the constructor is : "+obj.getName());
    }
}
