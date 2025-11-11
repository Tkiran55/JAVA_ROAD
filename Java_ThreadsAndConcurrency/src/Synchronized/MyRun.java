package Synchronized;

public class MyRun implements Runnable{
    Printer printer;
    MyRun(Printer p ){
        printer = p;
    }

    public void run(){
        printer.printNumbers();
    }
}
