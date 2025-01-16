import java.util.ArrayList;
import java.util.Scanner;

class CartItem {
    private String itemName;
    private double price;
    private int quantity;

 
    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    
    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }


    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    public double calculateCost() {
        return price * quantity;
    }

   
    public void displayItem() {
        System.out.println("Item Name: " + itemName);
        System.out.printf("Price: %.2f, Quantity: %d, Total Cost: %.2f%n", price, quantity, calculateCost());
    }
}

public class ShoppingCart {
    private ArrayList<CartItem> cart;

    public ShoppingCart() {
        cart = new ArrayList<>();
    }

   
    public void addItem(String itemName, double price, int quantity) {
        for (CartItem item : cart) {
            if (item.getItemName().equalsIgnoreCase(itemName)) {
                item.setQuantity(item.getQuantity() + quantity);
                System.out.println("Updated quantity for " + itemName);
                return;
            }
        }
        cart.add(new CartItem(itemName, price, quantity));
        System.out.println(itemName + " added to the cart.");
    }

   
    public void removeItem(String itemName) {
        for (CartItem item : cart) {
            if (item.getItemName().equalsIgnoreCase(itemName)) {
                cart.remove(item);
                System.out.println(itemName + " removed from the cart.");
                return;
            }
        }
        System.out.println("Item not found in the cart.");
    }

 
    public void displayCart() {
        if (cart.isEmpty()) {
            System.out.println("Your cart is empty.");
            return;
        }
        System.out.println("Items in your cart:");
        for (CartItem item : cart) {
            item.displayItem();
        }
    }

  
    public void displayTotalCost() {
        if (cart.isEmpty()) {
            System.out.println("Your cart is empty. Total cost: 0.00");
            return;
        }
        double totalCost = 0;
        for (CartItem item : cart) {
            totalCost += item.calculateCost();
        }
        System.out.printf("Total Cost: %.2f%n", totalCost);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ShoppingCart cart = new ShoppingCart();

        System.out.println("Welcome to the Shopping Cart System!");
        while (true) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Add Item to Cart");
            System.out.println("2. Remove Item from Cart");
            System.out.println("3. Display Cart Items");
            System.out.println("4. Display Total Cost");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter item name: ");
                    sc.nextLine(); // Consume newline
                    String itemName = sc.nextLine();
                    System.out.print("Enter price: ");
                    double price = sc.nextDouble();
                    System.out.print("Enter quantity: ");
                    int quantity = sc.nextInt();
                    cart.addItem(itemName, price, quantity);
                    break;
                case 2:
                    System.out.print("Enter item name to remove: ");
                    sc.nextLine(); // Consume newline
                    String removeItem = sc.nextLine();
                    cart.removeItem(removeItem);
                    break;
                case 3:
                    cart.displayCart();
                    break;
                case 4:
                    cart.displayTotalCost();
                    break;
                case 5:
                    System.out.println("Thank you for shopping with us! Goodbye!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}