import java.util.Scanner;

class Product {
    static double discount;  
    final int productID; 
    String productName;
    double price;
    int quantity;

    public Product(String productName, double price, int quantity, int productID) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productID = productID;
    }

    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    public void displayDetails() {
        System.out.println("\n===========================");
        System.out.println("Product Name: " + productName);
        System.out.println("Product ID: " + productID);
        System.out.printf("Price: $%.2f%n", price);
        System.out.println("Quantity: " + quantity);
        System.out.printf("Discount: %.2f%%%n", discount);
        System.out.printf("Total Price after Discount: $%.2f%n", calculateTotalPrice());
    }

    public double calculateTotalPrice() {
        return price * quantity * (1 - discount / 100);
    }
}

public class ShoppingCart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask for discount percentage
        System.out.print("Enter Discount Percentage: ");
        Product.updateDiscount(sc.nextDouble());

        while (true) {
            sc.nextLine();  
            
            System.out.print("Enter Product Name: ");
            String productName = sc.nextLine();
            
            System.out.print("Enter Price: ");
            double price = sc.nextDouble();
            
            System.out.print("Enter Quantity: ");
            int quantity = sc.nextInt();

            int productID = (int) (Math.random() * 1000);  // Random product ID

            Product product = new Product(productName, price, quantity, productID);
            product.displayDetails();

            System.out.print("\nDo you want to add another product? (yes/no): ");
            sc.nextLine(); 
            if (!sc.nextLine().equalsIgnoreCase("yes")) {
                break;
            }
        }
        sc.close();
    }
}
