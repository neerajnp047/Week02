import java.util.ArrayList;
import java.util.Scanner;

class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public void displayBookInfo() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}

class Library {

    private String libraryName;
    private ArrayList<Book> books;

    public Library(String libraryName) {
        this.libraryName = libraryName;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book \"" + book.getTitle() + "\" added to " + libraryName);
    }

    public void displayBooks() {
        System.out.println("Books in " + libraryName + ":");
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
        } else {
            for (Book book : books) {
                book.displayBookInfo();
            }
        }
    }
}

public class LibraryBook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Library library1 = new Library("New Library");
        Library library2 = new Library("Old Library");

        System.out.println("Enter the number of books to add to New Library:");
        int numBooksCity = sc.nextInt();
        sc.nextLine(); 

        for (int i = 1; i <= numBooksCity; i++) {
            System.out.println("Enter details for book " + i + " (title and author):");
            String title = sc.nextLine();
            String author = sc.nextLine();
            Book book = new Book(title, author);
            library1.addBook(book);
        }

        System.out.println("Enter the number of books to add to Old Library:");
        int numBooksTown = sc.nextInt();
        sc.nextLine(); 

        for (int i = 1; i <= numBooksTown; i++) {
            System.out.println("Enter details for book " + i + " (title and author):");
            String title = sc.nextLine();
            String author = sc.nextLine();
            Book book = new Book(title, author);
            library2.addBook(book);
        }

        System.out.println();
        library1.displayBooks();
        System.out.println();
        library2.displayBooks();

        sc.close();
    }
}
