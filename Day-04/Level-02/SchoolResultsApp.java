import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Subject {
    String name;
    int marks;

    public Subject(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

class Student {
    String name;
    List<Subject> subjects;

    public Student(String name) {
        this.name = name;
        this.subjects = new ArrayList<>();
    }

    public void addSubject(String subjectName, int marks) {
        subjects.add(new Subject(subjectName, marks));
    }

    List<Subject> getSubjects() {
        return subjects;
    }
}

class GradeCalculators {
    static String calculateGrade(int marks) {
        if (marks >= 90) return "A";
        else if (marks >= 80) return "B";
        else if (marks >= 70) return "C";
        else if (marks >= 60) return "D";
        else return "F";
    }

    static Map<String, String> calculateStudentGrades(Student student) {
        Map<String, String> result = new HashMap<>();
        for (Subject subject : student.getSubjects()) {
            result.put(subject.name, calculateGrade(subject.marks));
        }
        return result;
    }
}

public class SchoolResultsApp {
    public static void main(String[] args) {
        Student student = new Student("Roshan");
        student.addSubject("Maths", 90);

        Student student2 = new Student("Aman");
        student2.addSubject("Science", 70);

        System.out.println("Subject and marks for " + student.name + ":");
        for (Subject subject : student.getSubjects()) {
            System.out.println(subject.name + ": " + subject.marks);
        }

        System.out.println("\nGrades for " + student.name + ":");
        Map<String, String> grades = GradeCalculators.calculateStudentGrades(student);
        for (Map.Entry<String, String> entry : grades.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
