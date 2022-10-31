package MultiLevelThreading;
class MyPrior extends Thread{
    public MyPrior(String name){
        super(name);
    }
public void run(){
        int i = 0;
    while(i < 60) {
        System.out.println("I m a "+this.getName());
        i++;
    }
        }
        }
public class Priorities {
    public static void main(String[] args) {
        MyPrior obj1 = new MyPrior("Pankaj");
        MyPrior obj2 = new MyPrior("Harry");
        MyPrior obj3 = new MyPrior("Tom");
        MyPrior obj4 = new MyPrior("Manish");
        MyPrior obj5 = new MyPrior("Raj");
        obj1.setPriority(Thread.MIN_PRIORITY);
        obj2.setPriority(Thread.MAX_PRIORITY);
        obj3.setPriority(Thread.MAX_PRIORITY);
        obj4.setPriority(Thread.MIN_PRIORITY);
        obj5.setPriority(Thread.MIN_PRIORITY);
        obj1.start();
        obj2.start();

    }
}
