class Vehicle {
    int maxSpeed;
    String fuelType;

    Vehicle(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    void displayInfo() {
        System.out.println("Displaying Vehicle Info");
    }
}

class Car extends Vehicle {
    int seatCapacity;

    Car(int maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }

    void displayInfo() {
        System.out.println("Max Speed of Car: " + maxSpeed);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Seat Capacity: " + seatCapacity);
    }
}

class Truck extends Vehicle {
    int numberOfTyres;

    Truck(int maxSpeed, String fuelType, int numberOfTyres) {
        super(maxSpeed, fuelType);
        this.numberOfTyres = numberOfTyres;
    }

    void displayInfo() {
        System.out.println("Max Speed of Truck: " + maxSpeed);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Number of Tyres: " + numberOfTyres);
    }
}

class MotorCycle extends Vehicle {
    int engineCc;

    MotorCycle(int maxSpeed, String fuelType, int engineCc) {
        super(maxSpeed, fuelType);
        this.engineCc = engineCc;
    }

    void displayInfo() {
        System.out.println("Max Speed of Motorcycle: " + maxSpeed);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Engine CC: " + engineCc);
    }
}

public class VehicleTransportSystem {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = new Car(220, "Bio Diesel", 5);
        vehicles[1] = new Truck(180, "Diesel", 12);
        vehicles[2] = new MotorCycle(150, "Petrol", 500);

        for (Vehicle vehicle : vehicles) {
            vehicle.displayInfo();
            System.out.println();
        }
    }
}
