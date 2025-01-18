import java.util.Scanner;

class Vehicle {
    String ownerName;
    String vehicleType;
    static double registrationFee = 500.00;

    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public void displayVehicleDetails() {
        System.out.println("\n===============================");
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.printf("Registration Fee: $%.2f%n", registrationFee);
    }

    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.printf("\nRegistration fee updated to: $%.2f%n", registrationFee);
    }
}

public class VehicleManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("\nEnter Owner Name: ");
            String ownerName = sc.nextLine();

            System.out.print("Enter Vehicle Type (e.g., Car, Bike): ");
            String vehicleType = sc.nextLine();

            Vehicle newVehicle = new Vehicle(ownerName, vehicleType);
            newVehicle.displayVehicleDetails();

            System.out.print("\nDo you want to update the Registration Fee? (y/n): ");
            String choice = sc.nextLine().trim().toLowerCase();

            if (choice.equals("y") || choice.equals("yes")) {
                System.out.print("Enter the new Registration Fee: ");
                double newFee = sc.nextDouble();
                sc.nextLine();
                Vehicle.updateRegistrationFee(newFee);
                newVehicle.displayVehicleDetails();
            }

            System.out.print("\nDo you want to add another vehicle? (y/n): ");
            choice = sc.nextLine().trim().toLowerCase();

            if (choice.equals("n") || choice.equals("no")) {
                System.out.println("Thank you for using the Vehicle Management System!");
                break;
            }
        }

        sc.close();
    }
}