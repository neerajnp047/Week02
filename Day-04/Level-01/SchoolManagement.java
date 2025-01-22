import java.util.ArrayList;

class School {
    private String name;
    private ArrayList<Student> students = new ArrayList<>();

    public School(String name) {
        this.name = name;
    }

    public void addStudent(Student student) {
        students.add(student);
        System.out.println(student.getName() + " added to " + name);
    }

    public void displayStudents() {
        System.out.println("Students in " + name + ":");
        students.forEach(s -> System.out.println("- " + s.getName()));
    }
}

class Student {
    private String name;
    private ArrayList<Course> courses = new ArrayList<>();

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void enroll(Course course) {
        courses.add(course);
        course.addStudent(this);
        System.out.println(name + " enrolled in " + course.getName());
    }

    public void displayCourses() {
        System.out.println(name + " is enrolled in:");
        courses.forEach(c -> System.out.println("- " + c.getName()));
    }
}

class Course {
    private String name;
    private ArrayList<Student> students = new ArrayList<>();

    public Course(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void displayStudents() {
        System.out.println("Students in " + name + ":");
        students.forEach(s -> System.out.println("- " + s.getName()));
    }
}

public class SchoolManagement {
    public static void main(String[] args) {
        School school = new School("Delhi Public School");
        Student alice = new Student("Rohan"), bob = new Student("John");
        Course math = new Course("Math"), science = new Course("Science");

        school.addStudent(alice);
        school.addStudent(bob);

        alice.enroll(math);
        alice.enroll(science);
        bob.enroll(math);

        school.displayStudents();
        math.displayStudents();
        science.displayStudents();
        alice.displayCourses();
        bob.displayCourses();
    }
}
