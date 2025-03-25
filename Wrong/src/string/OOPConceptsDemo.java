package string;
import java.util.Scanner;

// 🌟 Abstraction: Abstract class with abstract methods
abstract class Vehicle {
    protected String brand;
    
    public Vehicle(String brand) {
        this.brand = brand;
    }

    public abstract void start();
    
    public void displayBrand() {
        System.out.println("Brand: " + brand);
    }
}

// 🌟 Inheritance: Car extends Vehicle
class Car extends Vehicle {
    private String model;
    private int speed;
    
    public Car(String brand, String model) {
        super(brand);
        this.model = model;
        this.speed = 0; // Default speed
    }

    // Method Overriding (Polymorphism)
    @Override
    public void start() {
        System.out.println(model + " is starting...");
    }

    // Method Overloading (Polymorphism)
    public void accelerate(int increase) {
        speed += increase;
        System.out.println(model + " accelerated to " + speed + " km/h");
    }

    public void accelerate() {
        speed += 10; // Default acceleration
        System.out.println(model + " accelerated to " + speed + " km/h");
    }

    public void displayDetails() {
        System.out.println("Model: " + model);
        System.out.println("Speed: " + speed + " km/h");
    }
}

// 🌟 Interface (Multiple Inheritance)
interface Electric {
    void chargeBattery();
}

// 🌟 ElectricCar implements both Car & Electric
class ElectricCar extends Car implements Electric {
    private int batteryLevel;

    public ElectricCar(String brand, String model) {
        super(brand, model);
        this.batteryLevel = 100;
    }

    @Override
    public void chargeBattery() {
        batteryLevel = 100;
        System.out.println("Battery fully charged.");
    }

    public void showBattery() {
        System.out.println("Battery Level: " + batteryLevel + "%");
    }
}

// 🌟 Encapsulation: Using private variables and getters/setters
class Owner {
    private String name;
    private int age;

    public Owner(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age!");
        }
    }

    public void displayOwnerInfo() {
        System.out.println("Owner: " + name + ", Age: " + age);
    }
}

// 🌟 Main class to test everything
public class OOPConceptsDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for car details
        System.out.print("Enter car brand: ");
        String brand = scanner.nextLine();
        
        System.out.print("Enter car model: ");
        String model = scanner.nextLine();
        
        Car myCar = new Car(brand, model);
        myCar.start();
        myCar.accelerate();
        myCar.accelerate(20);
        myCar.displayBrand();
        myCar.displayDetails();

        // Creating an electric car
        ElectricCar tesla = new ElectricCar("Tesla", "Model X");
        tesla.start();
        tesla.showBattery();
        tesla.chargeBattery();

        // Taking user input for owner details
        System.out.print("Enter owner name: ");
        String ownerName = scanner.nextLine();
        
        System.out.print("Enter owner age: ");
        int ownerAge = scanner.nextInt();
        
        Owner owner = new Owner(ownerName, ownerAge);
        owner.displayOwnerInfo();

        scanner.close();
    }
}
