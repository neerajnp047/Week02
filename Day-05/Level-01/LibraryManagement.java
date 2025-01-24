class Book{
    String title;
    int publicationYear;

    public Book(String title, int publicationYear){
        this.title = title;
        this.publicationYear = publicationYear;
    }
    void displayInfo(){
       System.out.println("Book Details");
    }
}
class Author extends Book {
    String name;
    String bio;
    Author(String title, int publicationYear, String name, String bio){
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }
    void displayInfo(){
        System.out.println("Title: " + title);
        System.out.println("Publication Year: " + publicationYear);
        System.out.println("Author: " + name);
        System.out.println("Bio: " + bio);
    }
}

public class LibraryManagement {
    public static void main(String[] args) {
        Book book = new Book("Learn language", 2014);
        book.displayInfo();
        Book author = new Author("Different Language", 2010, "Cherry Garg", "Learn all Programing Language");   
        author.displayInfo();
    }
}
