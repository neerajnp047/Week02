import java.util.Scanner;

class Product{
    String productName;
    double price;
    static int totalProducts = 0;

    public Product(String productName, double price){
        this.productName = productName;
        this.price = price;
        totalProducts++;

    }

    public void displayProductDetails(){
        System.out.println("\n=================================");
        System.out.println("Product name: " + productName);
        System.out.println("Price: " + price);
        
    }
    public static void displayTotalProducts(){
        System.out.println("Total Products: " + totalProducts);

    }
}

public class ProductDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
               

        
        while(true){
            System.out.print("Enter the name of the product: ");
            String productName = sc.nextLine();
            System.out.print("Enter the price of the product: ");
            double price = sc.nextDouble(); 
            sc.nextLine();
            Product newProduct = new Product(productName, price);
            newProduct.displayProductDetails();
            Product.displayTotalProducts();
            System.out.println("Want to add more products? (y/n):");
            String choice = sc.nextLine().trim().toLowerCase();
            if(choice.equals("n") || choice.equals("no")){
                System.out.println("Thank you for using the Product System!");
                sc.close();
                break;                
            }

        } 
        
    

        
    }
    
}