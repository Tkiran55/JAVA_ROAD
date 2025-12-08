import java.util.ArrayList;
import java.util.List;

public class Member {

    private static int idCounter = 1001;

    private int memberId;
    private String name;
    private String contact;
    private List<Book> issuedBooks;

    public Member(String name, String contact) {
        this.memberId = idCounter++;
        this.name = name;
        this.contact = contact;
        this.issuedBooks = new ArrayList<>();
    }

    public int getMemberId() { return memberId; }
    public String getName() { return name; }

    public boolean returnBook(Book book) {
        if (issuedBooks.remove(book)) {
            book.setAvailable(true);
            return true;
        }
        return false;
    }
    public boolean issueBook(Book book) {
        if (book.isAvailable()) {
            book.setAvailable(false);
            issuedBooks.add(book);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return String.format("Member ID: %d | Name: %-20s | Contact: %s | Issued Book: %d ",
                memberId, name, contact, issuedBooks.size());
    }


}