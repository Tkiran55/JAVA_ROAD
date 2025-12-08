import java.util.ArrayList;
import java.util.List;

public  class Library {

    List<Book> books;
    List<Member> members;

    public Library(){
        this.books = new ArrayList<>();
        this.members = new ArrayList<>();
        // Adding 1 default book
        addDefaultBook();

        // Adding 1 default member
        addDefaultMember();
    }

    private void addDefaultBook() {
        Book defaultBook = new Book("Java Programming", "James Gosling", "978-0134685991");
        books.add(defaultBook);
        System.out.println("Default book added: " + defaultBook);
    }

    private void addDefaultMember() {
        Member defaultMember = new Member("Alice Johnson", "alice@example.com");
        members.add(defaultMember);
        System.out.println("Default member registered: " + defaultMember);
    }

    public void addBook(String bookTitle, String bookAuthor, String isISsued){
        Book book =new Book(bookTitle,bookAuthor,isISsued);
        books.add(book);
        System.out.println("Book added successfully" + book);
    }

    public void displayAllBooks() {
        if(books.isEmpty()){
            System.out.println("The library has no books yet");
            return;
        }
        System.out.println("Displaying all books:");
        for(Book book: books){
            System.out.println("ID: " + book.getBookId() + ", Title: " + book.getTitle() + ", Author: " + book.getAuthor() + ", Available: " + book.isAvailable());
        }
    }

    public void addNewMember(String name, String contact){
        Member member = new Member(name, contact);
        members.add(member);
        System.out.println("Member registered successfully! " + member);
    }

    public void displayAvailableBooks(){
        System.out.println("Available books are:");
        for(Book b: books){
            if(b.isAvailable()){
                System.out.println(b);
            }
        }

    }

    public void issueBook(int memberId, int bookId) {
        Member member = findMemberById(memberId);
        Book book = findBookById(bookId);

        if (member == null) {
            System.out.println("Member not found!");
            return;
        }
        if (book == null) {
            System.out.println("Book not found!");
            return;
        }
        if (!book.isAvailable()) {
            System.out.println("Sorry, this book is already issued.");
            return;
        }

        if (member.issueBook(book)) {
            System.out.println("Book issued successfully to " + member.getName());
        }
    }

    // Helper methods
    private Book findBookById(int bookId) {
        for (Book b : books) {
            if (b.getBookId() == bookId) return b;
        }
        return null;
    }

    private Member findMemberById(int memberId) {
        for (Member m : members) {
            if (m.getMemberId() == memberId) return m;
        }
        return null;
    }

    public void returnBook(int memberId, int bookId) {
        Member member = findMemberById(memberId);
        Book book = findBookById(bookId);

        if (member == null || book == null) {
            System.out.println("Invalid member or book ID.");
            return;
        }

        if (member.returnBook(book)) {
            System.out.println("Book returned successfully by " + member.getName() + "!");
        } else {
            System.out.println(member.getName() + " did not borrow this book.");
        }
    }

    public void searchBookByTitle(String keyword) {
        System.out.println("\n=== Search Results for '" + keyword + "' ===");
        boolean found = false;
        for (Book b : books) {
            if (b.getTitle().toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println(b);
                found = true;
            }
        }
        if (!found) System.out.println("No matching books found.");
        System.out.println();
    }
}