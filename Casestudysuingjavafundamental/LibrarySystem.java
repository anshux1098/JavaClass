class Book {
    int bookId;
    String title;
    String author;
    boolean isIssued = false;

    Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }

    void issueBook() {
        if (isIssued) {
            System.out.println("Book is already issued.");
        } else {
            isIssued = true;
            System.out.println("Book issued successfully.");
        }
    }

    void returnBook() {
        isIssued = false;
        System.out.println("Book returned successfully.");
    }

    void displayBook() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        if (isIssued) {
            System.out.println("Status: Issued");
        } else {
            System.out.println("Status: Available");
        }
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        Book b1 = new Book(1, "Java Basics", "James Gosling");
        b1.displayBook();
        b1.issueBook();
        b1.issueBook();
        b1.returnBook();
        b1.displayBook();
    }
}
