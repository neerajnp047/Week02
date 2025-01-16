import java.util.Scanner;

class Employee {
    String name;
    String employeeId;
    double salary;

    public Employee(String name, String employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }
    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Salary: " + salary);
    }
}

public class EmployeDetail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input details
        System.out.println("Enter Employee Name: ");
        String name = sc.nextLine();
        System.out.println("Enter Employee ID: ");
        String id = sc.nextLine();
        System.out.println("Enter Employee Salary: ");
        double salary = sc.nextDouble();
        Employee employee = new Employee(name, id, salary);
        employee.displayDetails();

        sc.close(); 
    }
}
