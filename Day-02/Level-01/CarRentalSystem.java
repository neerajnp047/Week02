import java.util.Scanner;

class CarRental{
    String customerName;
    String carModel;
    int rentalDays;
    double pricePerDay;

    public CarRental(String customerName, String carModel, int rentalDays, double pricePerDay){
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.pricePerDay = pricePerDay;
    }

    public double calculatePrice(){
        return rentalDays * pricePerDay;
    }

    public void displayDetails(){
        System.err.println("\n======================================");
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car model: " + carModel);
        System.out.println("Rent Days: " + rentalDays);
        System.out.println("Total price: " + calculatePrice() + " for " + rentalDays + " days.");
    }
}
public class CarRentalSystem {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of Customer: ");
        String customerName = sc.nextLine();
        System.out.print("Enter the model of car: ");
        String carModel = sc.nextLine();
        System.out.print("How many Days rented for: ");
        int rentalDays = sc.nextInt();
        System.out.print("Enter the price per day: ");
        double price = sc.nextDouble();

        CarRental car = new CarRental(customerName, carModel, rentalDays, price);
        car.displayDetails();
        sc.close();
    }
    
}