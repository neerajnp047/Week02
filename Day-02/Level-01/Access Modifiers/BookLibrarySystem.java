class Book {
    public String ISBN;
    protected String title;
    private String author;

    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void displayBookDetails() {
        System.out.println("\n===========================");
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

class EBook extends Book {
    private double fileSize;

    public EBook(String ISBN, String title, String author, double fileSize) {
        super(ISBN, title, author);
        this.fileSize = fileSize;
    }

    public void displayEBookDetails() {
        System.out.println("\n===========================");
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("File Size: " + fileSize + " MB");
    }
}

public class BookLibrarySystem {
    public static void main(String[] args) {
        Book book = new Book("978-3-16-148410-0", "Cat's Cradle", "Kurt");
        book.displayBookDetails();

        book.setAuthor("Kurt Vonnegut");
        System.out.println("\nUpdated Author: " + book.getAuthor());

        EBook eBook = new EBook("978-0-345-39180-3", "1984", "George Orwell", 2.5);
        eBook.displayEBookDetails();
    }
}