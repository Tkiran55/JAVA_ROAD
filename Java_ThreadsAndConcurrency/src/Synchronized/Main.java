package Synchronized;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Printer printer = new Printer();

        Thread t1 = new Thread(new MyRun(printer), "Thread A");
        Thread t2 = new Thread(new MyRun(printer), "Thread B");

        t1.start();
        t2.start();


    }
}
