import java.util.Scanner;

public class LibraryMain {
    static Scanner sc = new Scanner(System.in);

    static Library library = new Library();
    public static void main(String[] args) {

        while(true) {
            System.out.println("----------Library Management System----------");
            System.out.print("1. Add New Book\n" +
                    "2. Register New Member\n" +
                    "3. Display All Books\n" +
                    "4. Display Available Books\n" +
                    "5. Issue Book\n" +
                    "6. Return Book\n" +
                    "7. Search Book by Title\n" +
                    "8. Exit\n" +
                    "Enter your choice:");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter a bookTitle: ");
                    String bookTitle = sc.nextLine();
                    System.out.print("Enter a bookAuthor: ");
                    String bookAuthor = sc.nextLine();
                    System.out.print("Is it issued: ");
                    String bookIsbn = sc.nextLine();

                    library.addBook(bookTitle, bookAuthor, bookIsbn);
                }
                case 2 -> {
                    System.out.print("Enter Member Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Contact (Phone/Email): ");
                    String contact = sc.nextLine();

                    library.addNewMember(name, contact);
                }
                case 3 -> library.displayAllBooks();
                case 4 -> library.displayAvailableBooks();
                case 5 -> {
                    System.out.print("Enter Member ID: ");
                    int memberId = sc.nextInt();
                    System.out.print("Enter Book ID to issue: ");
                    int bookId = sc.nextInt();
                    library.issueBook(memberId, bookId);
                }
                case 6 -> {
                    System.out.print("Enter Member ID: ");
                    int mId = sc.nextInt();
                    System.out.print("Enter Book ID to return: ");
                    int bId = sc.nextInt();
                    library.returnBook(mId, bId);
                }
                case 7 -> {
                    System.out.print("Enter title keyword: ");
                    String keyword = sc.nextLine();
                    library.searchBookByTitle(keyword);
                }
                case 8 -> {
                    System.out.println("\nThank you for using Library Management System!");
                    sc.close();
                    System.exit(0);
                }
                default ->
                    System.out.println("Wrong choice");

            }

        }
    }
}