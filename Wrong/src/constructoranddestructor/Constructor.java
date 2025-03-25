package constructoranddestructor;

class Car {
                  	
	
	
    String brand;
    int speed;

    // 1️⃣ Default Constructor (No Parameters)
    Car() {
        this.brand = "Unknown";
        this.speed = 0;
        System.out.println("Default Constructor: Car created!");
    }

    // 2️⃣ Parameterized Constructor
    Car(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
        System.out.println("Parameterized Constructor: " + brand + " with speed " + speed + " km/h created!");
    }

    // 3️⃣ Copy Constructor (Cloning an object)
    Car(Car car) {
        this.brand = car.brand;
        this.speed = car.speed;
        System.out.println("Copy Constructor: Duplicated " + brand + " with speed " + speed + " km/h!");
    }

    // Method to display car details
    void display() {
        System.out.println("Car Brand: " + brand + ", Speed: " + speed + " km/h");
    }

    public static void main(String[] args) {
        System.out.println("🚗 Constructor Demonstration in Java\n");

        // Creating an object using the Default Constructor
        Car car1 = new Car();
        car1.display();

        System.out.println("\n--------------------\n");

        // Creating an object using the Parameterized Constructor
        Car car2 = new Car("Tesla", 250);
        car2.display();

        System.out.println("\n--------------------\n");

        // Creating an object using the Copy Constructor
        Car car3 = new Car(car2);
        car3.display();
    }
}
