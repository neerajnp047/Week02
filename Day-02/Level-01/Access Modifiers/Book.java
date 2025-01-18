import java.util.Scanner;

class BookName{
    String title;
    String author;
    double price;
    //Default Constructor
    public BookName(){
        this.title = "Unknown title";
        this.author = "Unknown author";
        this.price = 0.0;
    }
    //Parameterized Constructor
    public BookName(String title, String author, double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public void displayDetails(){
        System.out.println("Book of the title: " + title);
        System.out.println("Author of the book: " + author);
        System.out.println("Price of the book: " + price);
    }
}

public class Book {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Title: ");
        String title = sc.nextLine();
        System.out.print("Author: ");
        String author = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextInt();
        BookName BookName1 = new BookName();
        BookName1.displayDetails();
        BookName BookName2 = new BookName(title, author, price);
        BookName2.displayDetails();
    }
}
