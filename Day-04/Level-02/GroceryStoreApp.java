import java.util.ArrayList;
import java.util.List;

class Product {
    String name;
    double pricePerUnit;
    double quantity;

    public Product(String name, double pricePerUnit, double quantity){
        this.name = name;
        this.pricePerUnit = pricePerUnit;
        this.quantity = quantity;
    }
    public double getTotalPrice() {
        return pricePerUnit * quantity;
    }
}
class Customer {
    String name;
    List<Product> products;

    public Customer(String name) {
        this.name = name;
        this.products = new ArrayList();
    }
    public void addProduct(String productName, double pricePerUnit, double quantity) {
        products.add(new Product(productName, pricePerUnit, quantity));
    }
    public List<Product> getProducts(){
        return products;
    }
}
class BillGenerator {
    public static double generateBill(Customer customer){
        double total = 0;
        for(Product product : customer.getProducts()){
            total += product.getTotalPrice();
        }
        return total;
    }
}

public class GroceryStoreApp {
    public static void main(String[] args) {
        Customer customer = new Customer("Rohan");
        customer.addProduct("Oranges ", 3.0, 2.0);
        customer.addProduct("Apples", 5.0, 10);

        System.out.println("Customer: " + customer.name);
        System.out.println("Product Purchased: ");
        for(Product product : customer.getProducts()){
            System.out.println(product.name + " (" + product.quantity + "units at $" + product.pricePerUnit + " per unit): $" + product.getTotalPrice());
        }
        double totalBill = BillGenerator.generateBill(customer);
        System.out.println("\nTotal Bill: $" + totalBill);
    }
}
