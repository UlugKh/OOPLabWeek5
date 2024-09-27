import java.util.List;
import java.util.ArrayList;

public class Librarian extends Person{
    private String librarianID;
    private String name;
    private List<Book> managedBooks;

    public Librarian(String name, String librarianID, String login, String password) {
        super(name, librarianID, age, login, password, UserRole.LIBRARIAN);
        this.managedBooks = new ArrayList<>();
    }
    private List<Book> managedBooks;

    public void addBook(Book book){
        managedBooks.add(book);
        System.out.println("Book added: " + book.getTitle());
    }

    public void removeBook(String bookID){
        Book bookToRemove = null;
        for (Book book : managedBooks) {
            if (book.getBookID() == bookID) {
                bookToRemove = book;
                break;
            }
        }
        if (bookToRemove != null) {
            managedBooks.remove(bookToRemove);
            System.out.println("Book removed: " + bookToRemove.getTitle());
        } else {
            System.out.println("Book not found.");
        }
    }
    public void issueBook(){

    }
}
