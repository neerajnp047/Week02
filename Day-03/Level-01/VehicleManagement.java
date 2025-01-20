import java.util.Scanner;

class Vehicle {
    static double registrationFee = 1500.0;  
    final String registrationNumber;  
    String ownerName;
    String vehicleType;

    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("Registration fee updated to: " + registrationFee);
    }

    public void displayDetails() {
        if (this instanceof Vehicle) {  
            System.out.println("\n===========================");
            System.out.println("Owner Name: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Registration Fee: " + registrationFee);
        } else {
            System.out.println("Invalid vehicle object.");
        }
    }
}

public class VehicleManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter new Registration Fee: ");
        Vehicle.updateRegistrationFee(sc.nextDouble());
        sc.nextLine();  

        while (true) {
            System.out.print("Enter Owner Name: ");
            String ownerName = sc.nextLine();

            System.out.print("Enter Vehicle Type: ");
            String vehicleType = sc.nextLine();

            System.out.print("Enter Registration Number: ");
            String registrationNumber = sc.nextLine();
            Vehicle vehicle = new Vehicle(ownerName, vehicleType, registrationNumber);

            vehicle.displayDetails();

            System.out.print("\nDo you want to add another vehicle? (yes/no): ");
            if (!sc.nextLine().equalsIgnoreCase("yes")) {
                break;
            }
        }

        sc.close();
    }
}
