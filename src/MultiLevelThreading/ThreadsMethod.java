package MultiLevelThreading;
class MyNewThread1 extends Thread{
   public void run(){
       int i = 0;
       while(i < 50){
           System.out.println("This is Thread1");
           i++;
       }
    }
}
class MyNewThread2 extends Thread{
    public void run(){
        int i = 0;
        while(i < 50){
            System.out.println("This is Thread2");
            try {
                Thread.sleep(455);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i++;
        }
    }
}
public class ThreadsMethod  {
    public static void main(String[]args){
        MyNewThread1 obj1 = new MyNewThread1();
        MyNewThread2 obj2 = new MyNewThread2();
        obj1.start();
        try {
            obj1.join();
        }
       catch(Exception e){
           e.printStackTrace();
       }
        obj2.start();
    }
}
