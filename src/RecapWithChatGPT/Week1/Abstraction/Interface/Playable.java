package RecapWithChatGPT.Week1.Abstraction.Interface;

interface Playable {

    default void play(){
        System.out.println("I am playing.");

    }

}
