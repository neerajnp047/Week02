import java.util.Scanner;

class Item{
    int itemCode;
    String itemName;
    int price;
    int quantity;

    public Item(int itemCode, String itemName, int price, int quantity){
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public double calculatePrice(){
        double totalPrice = quantity * price;
        return totalPrice;

    }
    public void displayDetails(){
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item name: " + itemName);
        System.out.println("Item price: " + price);
        System.out.println("Item quantity: " + quantity);
        System.out.println("Total price: " + calculatePrice());
    }
    
}

public class InventoryOfItems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Item Code: ");
        int item = sc.nextInt();
        System.out.println("Item Name: ");
        String name = sc.next();
        System.out.println("Enter a quantity: ");
        int quantity = sc.nextInt();
        System.out.println("Price: ");
        int price = sc.nextInt();
        Item Item = new Item(item, name, price, quantity);
        Item.displayDetails();
    }
}
