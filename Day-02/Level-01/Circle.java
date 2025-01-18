import java.util.Scanner;

class CircleR{
    double radius;
//default Constructor
    public CircleR(){
        radius = 1.0;
    }
//Parameterized Constructor
    public CircleR(double radius){
        this.radius = radius;
    }
    public double calculateArea(){
        return Math.PI * radius * radius;
    }
    public double calculateCircumference(){
        return 2 * Math.PI * radius;
    }
    public void displayDetails(){
        System.out.println("Radius " + radius);
        System.out.println("Area: " + calculateArea());
        System.out.println("Circumference: " + calculateCircumference());
    }
}

public class Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Radius: ");
        double radius = sc.nextDouble();
        CircleR circle1 = new CircleR();
        circle1.displayDetails();
        CircleR circle2 = new CircleR(radius);
        circle2.displayDetails();
    }
}
