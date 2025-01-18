package multiThreading;

class SharedResource{
    int x = 0;
    boolean lock=false;

    public synchronized void Producer(int num) throws InterruptedException {
        while(lock) {
            wait();
        }
        x=num;
        lock=true;
        System.out.println("Producer : "+x);
        notify();

    }
    public synchronized void Consumer() throws InterruptedException {
        while(!lock){
            wait();
        }
        System.out.println("Consumer : "+x);
        lock=false;
        notify();

    }
}


public class InterThreadCommunication {
    public static void main(String[] args) throws Exception {
        SharedResource s1 = new SharedResource();
        Thread t1 = new Thread(()->{
            for (int i = 0; i < 5; i++) {
                try {
                    s1.Producer(i);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        Thread t2 = new Thread(()->{
            for (int i = 0; i < 5; i++) {
                try {
                    s1.Consumer();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        t1.start();
        t2.start();

        throw new Exception("cc");
    }
}
