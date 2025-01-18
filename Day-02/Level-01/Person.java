import java.util.Scanner;

class PersonP{
    String name;
    int age;
//Default Constructor
    public PersonP(){
        this.name = "Unknown";
        this.age = 0;
    }
//Parameterized Constructor
    public PersonP(String name, int age){
        this.name = name;
        this.age = age;
    }
//Copy Constructor
    public PersonP(PersonP newPerson){
        this.name = newPerson.name;
        this.age = newPerson.age;
    }
    public void displayDetails(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Person {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a name: ");
        String name = sc.nextLine();
        System.out.println("Enter a age: ");
        int age = sc.nextInt();
        PersonP person1 = new PersonP();
        person1.displayDetails();
        PersonP person2 = new PersonP(name, age);
        person2.displayDetails();
        PersonP person3 = new PersonP(person2);
        person3.displayDetails();
        

    }
    
}
