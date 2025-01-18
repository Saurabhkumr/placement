package multiThreading;

public class UsingAnonymousClass {
    public static void main(String[] args) throws InterruptedException {
        Runnable r1 = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("hii...");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        Runnable r2 = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("bye...");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        t1.setName("thread 1");
        t2.setName("thread 2");
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(t1.isAlive());
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        System.out.println("i am main");
    }
}
