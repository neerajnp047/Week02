import java.util.Scanner;

class Student {
    static String universityName = "Bridgelabz";  
    static int totalStudents = 0; 
    final int rollNumber;  
    String name;
    char grade;

    public Student(String name, int rollNumber, char grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;  
    }

    public static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }

    public void displayDetails() {
        if (this instanceof Student) {  
            System.out.println("\n===========================");
            System.out.println("University Name: " + universityName);
            System.out.println("Student Name: " + name);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Grade: " + grade);
        } else {
            System.out.println("Invalid student object.");
        }
    }

    public void updateGrade(char newGrade) {
        if (this instanceof Student) {
            this.grade = newGrade;
            System.out.println("Grade updated to: " + grade);
        } else {
            System.out.println("Invalid student object.");
        }
    }
}

public class StudentManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter Student Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Roll Number: ");
            int rollNumber = sc.nextInt();

            System.out.print("Enter Grade: ");
            char grade = sc.next().charAt(0);

            Student student = new Student(name, rollNumber, grade);

            student.displayDetails();

            System.out.print("\nDo you want to add another student? (yes/no): ");
            sc.nextLine();  // Clear the buffer
            if (!sc.nextLine().equalsIgnoreCase("yes")) {
                break;
            }
        }

        Student.displayTotalStudents();
        
        sc.close();
    }
}
