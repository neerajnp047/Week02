import java.util.ArrayList;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void displayProductInfo() {
        System.out.println(name + " - $" + price);
    }
}

class Order {
    private ArrayList<Product> products = new ArrayList<>();
    private Customer customer;

    public Order(Customer customer) {
        this.customer = customer;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void displayOrderInfo() {
        System.out.println("Order placed by " + customer.getName() + ":");
        products.forEach(Product::displayProductInfo);
        System.out.println("Total: $" + calculateTotal());
    }

    public double calculateTotal() {
        return products.stream().mapToDouble(Product::getPrice).sum();
    }
}

class Customer {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void placeOrder(Order order) {
        System.out.println(name + " has placed an order.");
        order.displayOrderInfo();
    }
}

public class ECommercePlatform {
    public static void main(String[] args) {
        Product product1 = new Product("Laptop", 1200.50);
        Product product2 = new Product("Smartphone", 799.99);
        Product product3 = new Product("Headphones", 199.99);

        Customer customer1 = new Customer("April");
        Customer customer2 = new Customer("Bob");

        Order order1 = new Order(customer1);
        order1.addProduct(product1);
        order1.addProduct(product2);

        Order order2 = new Order(customer2);
        order2.addProduct(product3);

        customer1.placeOrder(order1);
        customer2.placeOrder(order2);
    }
}
