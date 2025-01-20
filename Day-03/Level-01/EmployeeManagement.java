import java.util.Scanner;

class Employee {
    static String companyName = "TechCorp";  
    static int totalEmployees = 0;  
    final int id; 
    String name;
    String designation;
    
    public Employee(String name, String designation, int id) {
        this.name = name;
        this.designation = designation;
        this.id = id;
        totalEmployees++;  
    }
    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    public void displayDetails() {
        if (this instanceof Employee) {  
            System.out.println("Company Name: " + companyName);
            System.out.println("Employee Name: " + name);
            System.out.println("Employee ID: " + id);
            System.out.println("Designation: " + designation);
        } else {
            System.out.println("Invalid employee object.");
        }
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Company Name: ");
        String name = sc.nextLine();
        
        System.out.print("Enter Employee Id: ");
        int id = sc.nextInt();
        
        sc.nextLine();  
        System.out.print("Enter Designation: ");
        String designation = sc.nextLine();
        Employee emp1 = new Employee(name, designation, id);

        emp1.displayDetails();
        Employee.displayTotalEmployees();

        sc.close(); 
    }
}
