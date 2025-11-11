package ImplementRunnableInterface;

public class Main {
    public static void main(String[] args) {
        MyRunnable myRun = new MyRunnable();

        Thread t1 = new Thread(myRun);

        t1.start();

    }
}
