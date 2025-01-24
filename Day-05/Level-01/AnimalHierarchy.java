class Animal{
    String name;
    int age;

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void makeSound(){
        System.out.println("Animal Makes Sound: ");
    }
}
class Dog extends Animal{
    Dog(String name, int age){
    super(name, age);
    }
    public void makeSound(){
        System.out.println("Name:" + name + " "+"Age:" + age + " " + "Sound:" +"Boow Boow");
    }
}
class Cat extends Animal{
    Cat(String name, int age){
        super(name, age);
    }
    public void makeSound(){
        System.out.println("Name:" + name + " "+"Age:" + age + " " + "Sound:" +"Meow Meow");
    }
}
class Bird extends Animal{
    Bird(String name, int age){
        super(name, age);
    }
    public void makeSound(){
        System.out.println("Name:" + name + " "+"Age:" + age + " " + "Sound:" +"Chirp Chirp");
    }
}

public class AnimalHierarchy {
    public static void main(String[] args) {
        Animal Dog = new Dog("German Shepard", 10);
        Animal Cat = new Cat("Persian Cat", 8);
        Animal Bird = new Bird("Parrot", 12);  
        Dog.makeSound();
        Cat.makeSound();
        Bird.makeSound();
    }
}
