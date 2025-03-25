package oops;

// Encapsulation Example in Java
public class EncapsulationExample {
    // Private variables (data hiding)
    private String name;
    private int age;

    // Constructor
    public EncapsulationExample(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter method for name
    public String getName() {
        return name;
    }

    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for age
    public int getAge() {
        return age;
    }

    // Setter method for age
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Age must be a positive number.");
        }
    }

    // Display method
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        // Creating an object
        EncapsulationExample person = new EncapsulationExample("Alice", 25);
        
        // Displaying initial values
        person.display();

        // Modifying values using setters
        person.setName("Bob");
        person.setAge(30);

        // Displaying updated values
        person.display();

        // Trying to set an invalid age
        person.setAge(-5); // Will print an error message
    }
}
