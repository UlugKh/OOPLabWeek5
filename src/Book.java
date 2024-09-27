public class Book {
    private String bookID;
    private String title;
    private String author;
    private boolean isAvailable;

    public Book(String title, String author) {
        this.bookID = BookIDGenerator.generateBookID();
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    public boolean borrowBook(){
       if (isAvailable) {
           isAvailable = false;
           return true;
       } else {
           System.out.println("The book is currently unavailable.");
           return false;
       }
    }
    public boolean returnBook() {
        if (isAvailable) {
            System.out.println("The book was available already.");
            return false;
        } else {
            isAvailable = true;
            return true;
        }
    }
    public void displayBook(){
        System.out.println("Book ID: " + bookID);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Availability: " + (isAvailable ? "Available" : "Not available"));
    }
}
