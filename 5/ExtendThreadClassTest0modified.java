public class ExtendThreadClassTest0 {
    public static void main(String args[]) {
        System.out.println("Creating PrintNameThread object instance..");
        PrintNameThread printNameThread1 =
                new PrintNameThread("A");

        System.out.println("Calling start() method of " + printNameThread1.getName() + " thread");
        pnprintNameThread1t1.start();

        System.out.println("Creating PrintNameThread object instance..");
        PrintNameThread printNameThread2 =
                new PrintNameThread("B");
        System.out.println("Calling start() method of " + printNameThread2.getName() + " thread");
        printNameThread2.start();

        System.out.println("Creating PrintNameThread object instance..");
        PrintNameThread printNameThread3 =
                new PrintNameThread("C");
        System.out.println("Calling start() method of " + printNameThread3.getName() + " thread");
        printNameThread3.start();
    }
}
