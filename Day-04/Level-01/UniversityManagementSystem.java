import java.util.ArrayList;

class Professor {
    private String name;

    public Professor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    } 

    public void assignProfessor(Course course) {
        course.setProfessor(this);
    }
}

class Course {
    private String courseName;
    private Professor professor;
    private ArrayList<Student> enrolledStudents = new ArrayList<>();

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public void enrollStudent(Student student) {
        enrolledStudents.add(student);
    }

    public void displayCourseInfo() {
        System.out.println("Course: " + courseName);
        System.out.println("Taught by: " + professor.getName());
        enrolledStudents.forEach(student -> System.out.println("- " + student.getName()));
    }
}

class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void enrollCourse(Course course) {
        course.enrollStudent(this);
    }
}

public class UniversityManagementSystem {
    public static void main(String[] args) {
        Professor professorA = new Professor("Dr. Sangeeta");
        Professor professorB = new Professor("Dr. John");

        Course course1 = new Course("Computer Science");
        Course course2 = new Course("Mathematics");

        professorA.assignProfessor(course1);
        professorB.assignProfessor(course2);

        Student student1 = new Student("Rohan");
        Student student2 = new Student("Samarth");

        student1.enrollCourse(course1);
        student2.enrollCourse(course2);

        course1.displayCourseInfo();
        course2.displayCourseInfo();
    }
}
