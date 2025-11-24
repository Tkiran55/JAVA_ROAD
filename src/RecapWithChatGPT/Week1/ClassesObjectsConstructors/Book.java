package RecapWithChatGPT.Week1.ClassesObjectsConstructors;

public class Book {
    //Create a class Book with: title, author, price
    String title;
    String author;
    double price;

    //Add:
    //default constructor
    Book(){
        System.out.println("I am default Constructor.");
    }
    //parameterized constructor
    Book(String bookTitle, String bookAuthor, double bookPrice){
        title = bookTitle;
        author = bookAuthor;
        price = bookPrice;
    }

    public void display(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
    }
    //Create objects using both.
    public static void main(String[] args) {
        Book book = new Book();
        Book book1 = new Book("Hero Academy", "Hero", 3500);

        book.display();
        book1.display();

    }
}
