package RecapWithChatGPt.L14Generics;
//Write a generic class called Box<T> that can store any type of object.
//It should: Have a field content of type T
//Have setContent() and getContent() methods

class Box<T>{
    T content;

    public void setContent(T content){
        this.content = content;
    }

    public T getContent(){
        return this.content;
    }
}

public class GenericsExe {
    public static void main(String[] args) {
        Box<String> b1 = new Box<>();
        b1.setContent("Hello Java!");

        Box<Integer> b2 = new Box<>();
        b2.setContent(2);

        System.out.println(b1.getContent());
        System.out.println(b2.getContent());


    }
}
