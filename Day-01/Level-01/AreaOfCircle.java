import java.util.Scanner;

class circle{
    double radius;

    public circle(double radius) {
        this.radius = radius;
    }
    public double calculateArea(){
        return Math.PI * Math.pow(radius, 2);
    }
    public double calculateCircumference(){
        return 2* Math.PI * radius;
    }
    public void displayDetails(){
        System.out.println("Radius " + radius);
        System.out.println("Area " + calculateArea());
        System.out.println("Circumference " + calculateCircumference());
    }
}

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius ");
        double radius = sc.nextDouble();
        circle circle = new circle(radius);
        circle.displayDetails();
    }
}
