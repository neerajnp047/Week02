class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;

    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double CGPA) {
        if (CGPA >= 0.0 && CGPA <= 10.0) {
            this.CGPA = CGPA;
        } else {
            System.out.println("Invalid CGPA. Please enter a value between 0.0 and 10.0.");
        }
    }

    public void displayStudentDetails() {
        System.out.println("\n===========================");
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.printf("CGPA: %.2f%n", CGPA);
    }
}

class PostgraduateStudent extends Student {
    public String specialization;

    public PostgraduateStudent(int rollNumber, String name, double CGPA, String specialization) {
        super(rollNumber, name, CGPA);
        this.specialization = specialization;
    }

    public void displayPostgraduateDetails() {
        System.out.println("\n===========================");
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Specialization: " + specialization);
        System.out.printf("CGPA: %.2f%n", getCGPA());
    }
}

public class UniversityManagementSystem {
    public static void main(String[] args) {
        Student student = new Student(101, "Sonu Sharma", 9.2);
        student.displayStudentDetails();

        student.setCGPA(8.8);
        System.out.println("\nUpdated CGPA: " + student.getCGPA());

        PostgraduateStudent pgStudent = new PostgraduateStudent(201, "Aryaman Sharma", 8.7, "Data Science");
        pgStudent.displayPostgraduateDetails();
    }
}