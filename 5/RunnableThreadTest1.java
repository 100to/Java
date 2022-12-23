public class RunnableThreadTest1 {
    public static void main(String args[]) {
        PrintNameRunnable printNameRunnable1 = new PrintNameRunnable("A");
        Thread thread1 = new Thread(printNameRunnable1);
        thread1.start();

        PrintNameRunnable printNameRunnable2 = new PrintNameRunnable("B");
        Thread thread2 = new Thread(printNameRunnable2);
        thread2.start();

        PrintNameRunnable printNameRunnable3 = new PrintNameRunnable("C");
        Thread thread3 = new Thread(printNameRunnable3);
        thread3.start();
    }
}