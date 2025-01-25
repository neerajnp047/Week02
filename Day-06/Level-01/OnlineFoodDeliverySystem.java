import java.util.*;

abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemName() { return itemName; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }

    public void getItemDetails() {
        System.out.println("Item Name: " + itemName + ", Price: " + price + ", Quantity: " + quantity);
    }

    public abstract double calculateTotalPrice();
}

interface Discountable {
    void applyDiscount(double discountRate);
    String getDiscountDetails();
}

class VegItem extends FoodItem implements Discountable {
    private double discount;

    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
        this.discount = 0;
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }

    @Override
    public void applyDiscount(double discountRate) {
        discount = calculateTotalPrice() * discountRate / 100;
    }

    @Override
    public String getDiscountDetails() {
        return "Discount Applied: " + discount;
    }
}

class NonVegItem extends FoodItem implements Discountable {
    private double additionalCharge;
    private double discount;

    public NonVegItem(String itemName, double price, int quantity, double additionalCharge) {
        super(itemName, price, quantity);
        this.additionalCharge = additionalCharge;
        this.discount = 0;
    }

    @Override
    public double calculateTotalPrice() {
        return (getPrice() * getQuantity()) + additionalCharge;
    }

    @Override
    public void applyDiscount(double discountRate) {
        discount = calculateTotalPrice() * discountRate / 100;
    }

    @Override
    public String getDiscountDetails() {
        return "Discount Applied: " + discount;
    }
}

public class OnlineFoodDeliverySystem {
    public static void processOrder(List<FoodItem> foodItems, double discountRate) {
        for (FoodItem item : foodItems) {
            item.getItemDetails();
            System.out.println("Total Price: " + item.calculateTotalPrice());

            if (item instanceof Discountable) {
                Discountable discountable = (Discountable) item;
                discountable.applyDiscount(discountRate);
                System.out.println(discountable.getDiscountDetails());
            }
        }
    }

    public static void main(String[] args) {
        List<FoodItem> order = Arrays.asList(
            new VegItem("Paneer Butter Masala", 200, 2),
            new NonVegItem("Chicken Biryani", 300, 1, 50)
        );

        processOrder(order, 10); // Apply a 10% discount
    }
}
