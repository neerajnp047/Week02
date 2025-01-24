class Employee{
    String name;
    int emloyeeId;
    double salary;

    public Employee(String name, int emloyeeId, double salary){
        this.name = name;
        this.emloyeeId = emloyeeId;
        this.salary = salary;
    }
    void displayDetails(){
        System.out.println("Display the detail: ");
    }
}
class Manager extends Employee{
    int teamSize;
    Manager(String name, int emloyeeId, double salary, int teamSize){
        super(name, emloyeeId, salary);
        this.teamSize = teamSize;
    }
    void displayDetails(){
        System.out.println("Employe name: " + name);
        System.out.println("Employee Id: " + emloyeeId);
        System.out.println("Employee Salary: " + salary);
        System.out.println("Team Size: " + teamSize);
    }
}
class Developer extends Employee{
    String programingLanguage;
    Developer(String name, int emloyeeId, double salary, String programingLanguage){
        super(name, emloyeeId, salary);
        this.programingLanguage = programingLanguage;
    }
    void displayDetails(){
        System.out.println("Employe name: " + name);
        System.out.println("Employee Id: " + emloyeeId);
        System.out.println("Employee Salary: " + salary);
        System.out.println("Programing Language: " + programingLanguage);
    }
}
class Intern extends Employee{
    String university;
    Intern(String name, int employeeId, double salary, String university){
        super(name, employeeId, salary);
        this.university = university;
    }
    void displayDetails(){
        System.out.println("Employe name: " + name);
        System.out.println("Employee Id: " + emloyeeId);
        System.out.println("Employee Salary: " + salary);
        System.out.println("University: " + university);
    }
}


public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee Manager = new Manager("Amaan", 5698, 50000.0, 4);
        Employee Developer = new Developer("Nishank", 96854, 35000.0, "Java");
        Employee Intern = new Intern("Abhishek", 89658, 15000.0, "Bridgelabz");
        Manager.displayDetails();
        Developer.displayDetails();
        Intern.displayDetails();
    }
}
