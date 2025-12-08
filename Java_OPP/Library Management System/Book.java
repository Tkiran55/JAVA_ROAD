public class Book {

    private static int idCount = 1;
    private int bookId;
    private String title;
    private String author;
    private boolean isAvailable;
    private String isbn;


    public Book(String title, String author, String isbn) {
        this.bookId = idCount++;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
        this.isbn= isbn;
    }


    public int getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }


    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) { isAvailable = available; }

    public String getIsbn(){
        return isbn;
    }

    @Override
    public String toString() {
        return String.format("ID: %d | Title: %-30s | Author: %-20s | Status: %s",
                bookId, title, author, isAvailable ? "Available" : "Issued");
    }
}