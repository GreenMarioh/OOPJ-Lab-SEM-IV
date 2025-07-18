class MyThread1 extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is running.");
    }
}

class MyThread2 extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is running.");
    }
}

public class MultiThread1 {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();
    }
}
