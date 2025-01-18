import java.util.Scanner;
class Book{
    String title;
    String author;
    int price;
    static int availability=10;
    public Book(){
        this.title="tiny habbit";
        this.author="Abhay";
        this.price=400;
    }
    public String borrowBook(){
        if(availability>0){
            availability--;
            return "Book is borrowed successfully";
        }
        else{
            return "Book is not available";
        }
    }
    public void showDetails(){
        System.out.println("Book name  is : "+title);
        System.out.println("author name is : "+author);
        System.out.println("price of that book  is : "+price);
        System.out.println("total "+availability+" books are available");
    }

}
public class LibraryBookSystem{
    public static void main(String[] args) {
        Book b= new Book();
        b.showDetails();
        while(true){
            Scanner sc=new Scanner (System.in);
            System.out.println("do you want to borrow a book?    (yes/no)");
            String choice=sc.nextLine();
            if(choice.equals("yes")){
                System.out.println(b.borrowBook());
                b.showDetails();
            }
            else{
                break;
            }
        }

       
    }
}