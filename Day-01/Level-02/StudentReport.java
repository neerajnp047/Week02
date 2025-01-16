import java.util.Scanner;

class Student{
    String name;
    int rollNumber;
    int marks;

    public Student(String name, int rollNumber, int marks){
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }
    public char calculateGrade(){
        if(marks >= 90){
            return 'A';
        } else if(marks>=75){
            return 'B';
        } else if(marks>=60){
            return 'C';
        } else if(marks>=50){
            return 'D';
        }else {
            return 'E';
        }
    }
    public void displayDetails(){
        System.out.println("Student Name: " + name);
        System.out.println("Student Roll Number" + rollNumber);
        System.out.println("Student marks: " + marks);
        System.out.println("Student Grade: " + calculateGrade());
    }
}

public class StudentReport {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student Name: ");
        String name = sc.next();
        System.out.println("Enter Student Roll Number: ");
        int rollNumber = sc.nextInt();
        System.out.println("Enter Student Marks: ");
        int marks = sc.nextInt();
        
        Student Student = new Student(name, rollNumber, marks);
        Student.displayDetails();
    }
}
