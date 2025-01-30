package OOPs.Multithreading;

public class ThreadRunnable {
    public static void main(String[] args) {
        MyRunnable1 b1 = new MyRunnable1();
        MyRunnable2 b2 = new MyRunnable2();

        Thread t1 = new Thread(b1);
        Thread t2 = new Thread(b2);

        t1.start();
        t2.start();
    }
}
class MyRunnable1 implements Runnable{
    public void run(){
        int i = 0;
        while (i < 100){
            System.out.println("Runnable 1 is running");
        }
    }
}
class MyRunnable2 implements Runnable{
    public void run(){
        int i = 0;
        while (i < 100){
            System.out.println("Runnable 2 is running");
        }
    }
}
