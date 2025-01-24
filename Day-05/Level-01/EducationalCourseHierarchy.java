class Course {
    String courseName;
    int duration; 

    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    void displayDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " hours");
    }
}

class OnlineCourse extends Course {
    String platform;
    boolean isRecorded;

    public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Platform: " + platform);
        System.out.println("Recorded: " + (isRecorded ? "Yes" : "No"));
    }
}

class PaidOnlineCourse extends OnlineCourse {
    double fee;
    double discount; 

    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    double calculateDiscountedFee() {
        return fee - (fee * discount / 100);
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Fee: " + fee);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Discounted Fee: " + calculateDiscountedFee());
    }
}

public class EducationalCourseHierarchy {
    public static void main(String[] args) {
        Course course = new Course("Introduction to Programming", 40);
        OnlineCourse onlineCourse = new OnlineCourse("Java Basics", 30, "Bridgelabz", true);
        PaidOnlineCourse paidCourse = new PaidOnlineCourse("Advanced Java", 50, "Bridgelabz", true, 200, 20);
        course.displayDetails();
        onlineCourse.displayDetails();
        paidCourse.displayDetails();
    }
}
