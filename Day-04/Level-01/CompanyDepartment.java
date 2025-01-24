import java.util.ArrayList;

class Company {
    private String companyName;
    private ArrayList<Department> departments = new ArrayList<>();

    public Company(String companyName) {
        this.companyName = companyName;
    }

    public void addDepartment(String departmentName) {
        departments.add(new Department(departmentName));
    }

    public void addEmployeeToDepartment(String departmentName, String employeeName) {
        for (Department department : departments) {
            if (department.getDepartmentName().equals(departmentName)) {
                department.addEmployee(employeeName);
                return;
            }
        }
        System.out.println("Department " + departmentName + " not found in " + companyName);
    }

    public void displayCompanyStructure() {
        System.out.println("Company: " + companyName);
        for (Department department : departments) {
            department.displayEmployees();
        }
    }

    class Department {
        private String departmentName;
        private ArrayList<Employee> employees = new ArrayList<>();

        public Department(String departmentName) {
            this.departmentName = departmentName;
        }

        public String getDepartmentName() {
            return departmentName;
        }

        public void addEmployee(String employeeName) {
            employees.add(new Employee(employeeName));
        }

        public void displayEmployees() {
            System.out.println("Department: " + departmentName);
            if (employees.isEmpty()) {
                System.out.println("No employees in this department.");
            } else {
                for (Employee employee : employees) {
                    System.out.println("Employee: " + employee.getName());
                }
            }
        }

        class Employee {
            private String name;

            public Employee(String name) {
                this.name = name;
            }

            public String getName() {
                return name;
            }
        }
    }
}

public class CompanyDepartment {
    public static void main(String[] args) {
        Company company = new Company("TechCorp");

        company.addDepartment("IT");
        company.addDepartment("HR");

        company.addEmployeeToDepartment("IT", "Smith");
        company.addEmployeeToDepartment("IT", "John");
        company.addEmployeeToDepartment("HR", "Alice");

        company.displayCompanyStructure();
    }
}
