// Basic Class and Object Creation
// Question: 
Create a Book class with the following attributes:

title (String)
author (String)
price (double)
Create a constructor that initializes all these attributes. Then create a main method where you:

Instantiate a Book object.
Print the details of the book using a method displayBookDetails().

// My Code:

class Book {
    String title, author;
    double price;
    
    void displayBookDetails(){
        System.out.println("Book Name:" + title);
        System.out.println("Author Name:" + author);
        System.out.println("price value:" + price);
    }
    Book(){
        title = "Java";
        author = "James Gosling";
        price = 500.00;
    }
    public static void main(String[] args) {
        Book stj= new Book();
        stj.displayBookDetails();
    }
}

// Encapsulation with Getters and Setters
// Question:
Create a Person class with the following attributes:

name (String)
age (int)
Encapsulate these properties by using private fields and provide public getter and setter methods. In the main method:

Create an object of Person.
Use getters and setters to set the values of the name and age.
Print the person's name and age.

// My Code:

class person{
    private String name;
    private int age;
    
    public String getName() {
        return name;
    }
    
    // Getter for age
    public int getAge() {
        return age;
    }
    
    public void setter(String name, int age){
        this.name= name;
        this.age=age;
    }
    
    public void printdata(){
        System.out.println("Name: " +name);
        System.out.println("Age: " +age);
    }
}
class PersonTest {
    public static void main(String[] args) {
       person p= new person();
       p.setter("Papa",29);
       p.printdata();

       System.out.println("Name: " +p.getName());
       System.out.println("Age: " +p.getAge());
    }
}

// Inheritance
// Question
Create two classes:

A base class Vehicle with attributes brand and model and a method displayInfo().
A derived class Car that extends Vehicle and adds an additional attribute fuelType. Override the displayInfo() method to also print the fuel type.
In the main method:

Instantiate a Car object and call displayInfo().

// My code:
class Vehicle {
    String brand="BMW", model="M5";
    
    public void displayInfo(){
        System.out.println("Car brand name: "+brand+" in model: "+model);
    }
}
class Car extends Vehicle{
    String fuelType = "Petrol";
    public void displayInfo(){
        System.out.println("Car brand name "+brand+" in model "+model+ " and runs on "+fuelType);
}}
class VehicleTest {
    public static void main(String[] args) {
        Car p = new Car();
        p.displayInfo();
}}

// Polymorphism
// Question:
Create a class Shape with a method area() that returns the area of the shape (you can simply return a message saying "Area of shape"). Create two subclasses, Circle and Rectangle, that override the area() method to return the actual area (e.g., π * radius² for a circle and length * breadth for a rectangle).

In the main method:

Create an array of Shape references.
Store objects of Circle and Rectangle in this array and call the area() method polymorphically.

// My Code:

class Shape {
    public void area() {
        System.out.println("Area of shape");
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) { // Constructor to assign the value
        this.radius = radius;
    }

    @Override
    public void area() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}

class Rectangle extends Shape {
    double length, breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public void area() {
        double area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }
}

class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];  //data passed as array
        shapes[0] = new Circle(5.0);
        shapes[1] = new Rectangle(4.0, 6.0);

        for (Shape shape : shapes) {
            shape.area(); // Polymorphic call  -- for rectangle and circle
        }
        Shape shapes1= new Shape(); // for top class shape
        shapes1.area(); 
    }
}

// Abstraction
// Question

Create an abstract class Appliance with an abstract method turnOn(). Create two subclasses WashingMachine and Refrigerator, and implement the turnOn() method in each class to display a message like "Washing Machine is now on" and "Refrigerator is now on."

In the main method:

Create objects of WashingMachine and Refrigerator.
Call the turnOn() method for both.

// My Code:

abstract class Appliance {
    abstract void turnOn();
}

class WashingMachine extends Appliance{
    void turnOn(){
        System.out.println("Washing Machine is now on");
    }
}

class Refrigerator extends WashingMachine{
    void turnOn(){
        System.out.println("Refrigerator is now on.");
    }
}

class Main {
    public static void main(String[] args) {
        Refrigerator reg = new Refrigerator();
        reg.turnOn();
    }
}

// static method 
// Question
Create a class Counter with:

A static variable count that keeps track of the number of objects created.
A static method incrementCount() that increases count by 1.
In the main method:

Create multiple Counter objects.
Call incrementCount() and print the count after each object creation.

// My Code:

class Counter {
    static int count;
    
    static void incremental(){
        count+=1;
        System.out.println("value of count: "+ count);
    }
}

class Main {
    public static void main(String[] args) {
        incremental(); //error accessing the value of count
        Counter.incremental(); // since it's a static and can be accessed by class name
        Counter.incremental();
        Counter.incremental();
    }
}

