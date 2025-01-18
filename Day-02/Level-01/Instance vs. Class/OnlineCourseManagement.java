import java.util.Scanner;

class Course{
    String courseName;
    int duration;
    double fee;
    static String instituteName; 

    public Course(String courseName, int duration, double fee){
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
       
    }
    public void displayCourseDetails(){
        System.err.println("\n===========================");
        System.out.println("Course name: "+ courseName);
        System.out.println("Course duration: " + duration);
        System.out.println("Fee: " + fee);
        System.out.println("Institue Name: " + instituteName);
    }

    public static void updateInstituteName(String institute){
        instituteName = institute;
        
    }

}
public class OnlineCourseManagement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter Institute Name: ");
        Course.updateInstituteName(sc.nextLine());

        while (true) {
           
            System.out.print("Enter Course Name: ");
            String courseName = sc.nextLine();

            System.out.print("Enter Course Duration (in days): ");
            int duration = sc.nextInt();

            System.out.print("Enter Course Fee: ");
            double fee = sc.nextDouble();
            sc.nextLine(); 
            Course newCourse = new Course(courseName, duration, fee);
            newCourse.displayCourseDetails();

            System.out.print("\nDo you want to update the Institute Name? (y/n): ");
            String choice = sc.nextLine().trim().toLowerCase();

            if (choice.equals("y") || choice.equals("yes")) {
                System.out.print("Enter Updated Institute Name: ");
                String updatedName = sc.nextLine();
                Course.updateInstituteName(updatedName);

                
                newCourse.displayCourseDetails();
            }

            
            System.out.print("\nDo you want to add another course? (y/n): ");
            choice = sc.nextLine().trim().toLowerCase();

            if (choice.equals("n") || choice.equals("no")) {
                System.out.println("Thank you for using the Online Course Management System!");
                break;
            }
        }

        sc.close();

    
    }
        
}