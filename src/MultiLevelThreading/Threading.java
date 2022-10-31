package MultiLevelThreading;
class MyThread1 extends Thread{
    public void run(){//Run method is a byDefault method in Thread Used To run the Thread there are many more method in
        //Thread in java;
        int i = 0;
        while(i < 50){
            System.out.println("Threading 1 is running ");
            i++;
        }
    }
}
class MyThread2 extends Thread{
    public void run(){
        int i = 0;
        while(i < 50){
            System.out.println("Threading 2 is running");
            i++;
        }

    }
}
public class Threading {
    public static void main(String[] args) {
        MyThread1 obj = new MyThread1();
        MyThread2 obj2 = new MyThread2();
        obj.start();//start method result in start of the Thread;
        obj2.start();
    }
}
