// Abstract Class Employee
abstract class Employee {
    private String employeeId;
    private String name;
    private double baseSalary;

    // Constructor
    public Employee(String employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    // Abstract method
    public abstract double calculateSalary();

    // Concrete method
    public void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Base Salary: " + baseSalary);
    }

    // Getter and Setter methods
    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
}

// FullTimeEmployee subclass
class FullTimeEmployee extends Employee {
    private double bonus;

    public FullTimeEmployee(String employeeId, String name, double baseSalary, double bonus) {
        super(employeeId, name, baseSalary);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + bonus;
    }
}

// PartTimeEmployee subclass
class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(String employeeId, String name, double baseSalary, int hoursWorked, double hourlyRate) {
        super(employeeId, name, baseSalary);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}
interface Department {
    void assignDepartment(String departmentName);
    String getDepartmentDetails();
}

// Test Class
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        // Create FullTimeEmployee and PartTimeEmployee objects
        Employee fullTimeEmployee = new FullTimeEmployee("BG009", "Sonu Nigam", 50000, 10000);
        Employee partTimeEmployee = new PartTimeEmployee("BG010", "Rohit Shrarma", 0, 20, 25);

        Employee[] employees = {fullTimeEmployee, partTimeEmployee};

        // Process list of employees and display their details
        for (Employee employee : employees) {
            employee.displayDetails();
            System.out.println("Calculated Salary: " + employee.calculateSalary());
            System.out.println();
        }
    }
}
