package Synchronized;

public class Printer {
    synchronized void printNumbers(){
        for(int i=1; i<=5; i++){
            System.out.println(Thread.currentThread().getName() +  " prints: " + i);
        }
    }
}
