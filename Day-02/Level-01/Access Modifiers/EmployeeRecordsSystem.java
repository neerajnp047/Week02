class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
            System.out.printf("\nSalary updated to: $%.2f%n", salary);
        } else {
            System.out.println("\nInvalid salary value!");
        }
    }

    public void displayEmployeeDetails() {
        System.out.println("\n===========================");
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.printf("Salary: $%.2f%n", salary);
    }
}

class Manager extends Employee {
    private String team;

    public Manager(int employeeID, String department, double salary, String team) {
        super(employeeID, department, salary);
        this.team = team;
    }

    public void displayManagerDetails() {
        System.out.println("\n===========================");
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.printf("Salary: $%.2f%n", getSalary());
        System.out.println("Team: " + team);
    }
}

public class EmployeeRecordsSystem {
    public static void main(String[] args) {
        Employee employee = new Employee(101, "HR", 50000.00);
        employee.displayEmployeeDetails();
        employee.setSalary(55000.00);
        employee.displayEmployeeDetails();

        Manager manager = new Manager(102, "Engineering", 90000.00, "Software Development");
        manager.displayManagerDetails();
        manager.setSalary(95000.00);
        manager.displayManagerDetails();
    }
}