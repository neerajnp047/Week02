import java.util.Scanner;

class phones{
    String brand;
    String model;
    double price;

    public phones(String brand, String model, double price){
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void displayDetails(){
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }
}

public class MobilePhone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the brand: ");
        String brand = sc.next();
        System.out.println("Enter the model: ");
        String model = sc.next();
        System.out.println("Enter the price: ");
        int price = sc.nextInt();

        phones phones = new phones(brand, model, price);
        phones.displayDetails();

    }
}
