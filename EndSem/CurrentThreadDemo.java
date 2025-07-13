public class CurrentThreadDemo {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println("Current thread: " + t);
        t.setName("Allahu Akbar");
        System.out.println("After name change: " + t);
        try {
            for (int i = 5; i > -1; i--) {
                System.out.println("Initiating " + t.getName() + " in " + i + " seconds...");
                Thread.sleep(1000); // Sleep for 1 second
                if (i == 0) {
                    System.out.println("Thread " + t.getName() + " has been initiated.\nBOOM!");
                }
            }
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e.getMessage());
        }

    }
}
