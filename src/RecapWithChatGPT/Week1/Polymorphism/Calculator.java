package RecapWithChatGPT.Week1.Polymorphism;

import RecapWithChatGPT.Week1.Inheritance.ExeFour.C;

public class Calculator {

    int add(int a, int b){
       return a + b;
    }

    double add(double a, double b){
        return a + b;
    }

    int add(int a, int b , int c){
        return a + b+ c;
    }

    public static void main(String[] args) {
        Calculator cal = new Calculator();
        System.out.println(cal.add(1,2));
        System.out.println(cal.add(1.5, 1.5));
        System.out.println(cal.add(2,2,2));
    }
}
