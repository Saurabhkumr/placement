package multiThreading;


class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("hii...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class MyThread2 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("bye...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class MyRunnableThread implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("hello...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class FirstThreadProgram {
    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread();
        MyThread2 t2 = new MyThread2();
        MyRunnableThread rt = new MyRunnableThread();
        Thread t3 = new Thread(rt);


        t1.start();
        Thread.sleep(100);
        t2.start();
        Thread.sleep(100);
        t3.start();
    }
}
