// Class and Objects:
class Animal{   //class
    public void sound(){  //method
        system.out.println("Animal makes sound");
    }
    public static void main(String args[]){
        Animal obj = new Animal();   //object
        obj.sound();
    }
}

// Inheritance:
class Animal{
    public void sound(){
        System.out.println("Animal makes sound");
    }
}
class Dog extends Animal{
    public void sound(){
        System.out.println("Dog barks");
    }
    public static void main(String args[]){
        Animal obj = new Animal();
        obj.sound(); //Animal makes sound
        Dog obj1 = new Dog();
        obj1.sound(); //Dog barks
    }
}

// Polymorphism:

// Method Overloading:     
class MathOperation {
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two double values
    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String args[]) {
        MathOperation obj = new MathOperation();
        System.out.println("Sum of two integers: " + obj.add(10, 20)); // 30
        System.out.println("Sum of three integers: " + obj.add(10, 20, 30)); // 60
        System.out.println("Sum of two doubles: " + obj.add(10.5, 20.5)); // 31.0
    }
}

// method overriding:
class Animal {
    public void sound() {
        System.out.println("Animal makes sound");
    }
}
class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }

    public static void main(String args[]) {
        Animal obj = new Animal();
        obj.sound(); // Animal makes sound

        Cat obj1 = new Cat();
        obj1.sound(); // Cat meows
    }
}

// Encapsulation:
class Encapsulation {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int newAge) {
        this.age = newAge;
    }

    public static void main(String[] args) {
        Encapsulation obj = new Encapsulation();
        obj.setName("John");
        obj.setAge(25);
        System.out.println("Name: " + obj.getName());
        System.out.println("Age: " + obj.getAge());
    }
}

// Abstraction:
abstract class Animal {
    public abstract void sound();

    public void sleep() {
        System.out.println("Animal is sleeping");
    }
}

class Lion extends Animal {
    public void sound() {
        System.out.println("Lion roars");
    }

    public static void main(String args[]) {
        Lion obj = new Lion();
        obj.sound(); // Lion roars
        obj.sleep(); // Animal is sleeping
    }
}

// interface 

