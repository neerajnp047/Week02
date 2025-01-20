import java.util.Scanner;

class Book {
    static String libraryName = "Now Library";  
    final String isbn;  
    String title;
    String author;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    public void displayDetails() {
        if (this instanceof Book) {  
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + isbn);
        } else {
            System.out.println("Invalid book object.");
        }
    }
}

public class LibraryManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get details for the first book
        System.out.println("Enter the Title of the book: ");
        String title = sc.nextLine();
        System.out.println("Enter Author of the book: ");
        String author = sc.nextLine();
        System.out.println("Enter ISBN of the book: ");
        String isbn = sc.nextLine();
        Book book1 = new Book(title, author, isbn);
        book1.displayDetails();

        Book.displayLibraryName();
        sc.close(); 
    }
}
