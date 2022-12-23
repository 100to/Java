public class ThreadsPriority {

    public static void main(String[] args) {

        Thread thread1 = new SimpleThread("Boston");
        thread1.start();
        thread1.setPriority(10);

        Thread thread2 = new SimpleThread("New York");
        thread2.start();
        // Set the thread priority to 5
        thread2.setPriority(5);

        Thread thread3 = new SimpleThread("Seoul");
        thread3.start();
        // Set the thread priority to 1
        thread3.setPriority(1);
    }
}