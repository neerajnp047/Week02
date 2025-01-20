import java.util.Scanner;

class Patient {
    static String hospitalName = "Hamidia Hospital";
    static int totalPatients = 0;
    final int patientID;
    String name;
    int age;
    String ailment;

    public Patient(String name, int age, String ailment, int patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;  
    }

    public static void getTotalPatients() {
        System.out.println("Total Patients Admitted: " + totalPatients);
    }

    public void displayDetails() {
        if (this instanceof Patient) {
            System.out.println("\n===========================");
            System.out.println("Hospital: " + hospitalName);
            System.out.println("Patient Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
            System.out.println("Patient ID: " + patientID);
        } else {
            System.out.println("Invalid patient object.");
        }
    }
}

public class HospitalManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter Patient Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Age: ");
            int age = sc.nextInt();
            sc.nextLine();  
            System.out.print("Enter Ailment: ");
            String ailment = sc.nextLine();

            int patientID = (int) (Math.random() * 1000);

            Patient patient = new Patient(name, age, ailment, patientID);
            patient.displayDetails();

            System.out.print("\nDo you want to add another patient? (yes/no): ");
            String choice = sc.nextLine().trim().toLowerCase();
            if (!choice.equals("yes")) break;
        }

        Patient.getTotalPatients();
        sc.close();
    }
}
