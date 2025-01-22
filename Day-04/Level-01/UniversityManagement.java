import java.util.ArrayList;

class Faculty {
    private String name;

    public Faculty(String name) {
        this.name = name;
    }

    public void displayInfo() {
        System.out.println("Faculty: " + name);
    }
}

class Department {
    private String name;
    private ArrayList<Faculty> faculties = new ArrayList<>();

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;  
    }

    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    public void displayFaculties() {
        System.out.println("Faculties in " + name + " department:");
        faculties.forEach(Faculty::displayInfo);
    }

    public void clearFaculties() {
        faculties.clear();
    }
}

class University {
    private String name;
    private ArrayList<Department> departments = new ArrayList<>();

    public University(String name) {
        this.name = name;
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public void deleteUniversity() {
        departments.clear();
    }

    public void displayDepartments() {
        System.out.println("Departments in " + name + ":");
        if (departments.isEmpty()) {
            System.out.println("No departments left.");
        } else {
            departments.forEach(d -> System.out.println("- " + d.getName()));  // Use the getter method for name
        }
    }
}

public class UniversityManagement {
    public static void main(String[] args) {
        University university = new University("Tech University");
        Department csDept = new Department("Computer Science");
        Department engDept = new Department("Engineering");

        Faculty profA = new Faculty("Prof. Vikash Gupta");
        Faculty profB = new Faculty("Prof. Hemant Vyas");

        university.addDepartment(csDept);
        university.addDepartment(engDept);

        csDept.addFaculty(profA);
        engDept.addFaculty(profB);

        university.displayDepartments();
        csDept.displayFaculties();
        engDept.displayFaculties();

        university.deleteUniversity();
        university.displayDepartments();

        profA.displayInfo();
        profB.displayInfo();
    }
}
