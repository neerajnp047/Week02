import java.util.Scanner;

class HandleBookDetails{
    String title;
    String author;
    int price;

    public HandleBookDetails(String title, String author, int price){
        this.title = title;
        this.author = author;
        this.price  = price;
    }
    public void displayDetails(){
        System.out.println("Title of the Book " + title);
        System.out.println("Author of the Book " + author);
        System.out.println("Price of the Book " + price);
    }
}

public class BookDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a title " );
        String title = sc.nextLine();
        System.out.println("Enter a author ");
        String author = sc.nextLine();
        System.out.println("Enter a price ");
        int price = sc.nextInt();

        HandleBookDetails HandleBookDetails = new HandleBookDetails(title, author, price);
        HandleBookDetails.displayDetails();

    }
}
