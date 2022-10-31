package MultiLevelThreading;
class MyThread3 implements Runnable {
    public void run() {
        int i = 0;
        while (i < 60) {
            System.out.println("Thread 3 is running");
            i++;
        }
    }
}
    class MyThread4 implements Runnable {
        public void run(){
            int i =0;
            while(i < 60){
                System.out.println("Thread 4 is running");
                i++;
            }
    }
}
public class ThreadUsingRunAbleInterface {
    public static void main(String[] args) {
        MyThread3 Bullet1 = new MyThread3();
        Thread Gun1 = new Thread(Bullet1);//This is a syntax to achieve Thread when we implement it from RunAble interface;

        MyThread4 Bullet2 = new MyThread4();
        Thread Gun2 = new Thread(Bullet2);
        Gun1.start();
        Gun2.start();
    }
}

