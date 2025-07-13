class ThreadDemo extends Thread {
    public void run() {
        System.out.println("Thread Name: " + Thread.currentThread().getName() + ", Thread Priority: "
                + Thread.currentThread().getPriority());
        for (int i = 4; i > 0; i--) {
            System.out.println("Thread: " + Thread.currentThread().getName() + " " + i);
        }
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void start() {
        super.start();
    }
}

public class TestThread {
    public static void main(String[] args) {
        ThreadDemo thread1 = new ThreadDemo();
        ThreadDemo thread2 = new ThreadDemo();
        ThreadDemo thread3 = new ThreadDemo();
        thread1.setPriority(Thread.MAX_PRIORITY);
        thread2.setPriority(Thread.NORM_PRIORITY);
        thread3.setPriority(Thread.MIN_PRIORITY);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
