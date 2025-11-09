package RecapWithChatGPt;

public class L7Exe {
    String title;
    String author;

    L7Exe(String bookTitle, String bookAuthor){
        title = bookTitle;
        author = bookAuthor;
    }

    void displayInfo(){
        System.out.println("Title: " + title + ", Author: " + author);
    }

    public static void main(String[] args) {
        L7Exe book1 = new L7Exe("Muna Madan", "Laxmi Prasad");
        L7Exe book2 = new L7Exe("Home", "Myself");

        book1.displayInfo();
        book2.displayInfo();

    }
}
