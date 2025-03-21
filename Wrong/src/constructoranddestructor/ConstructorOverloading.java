package constructoranddestructor;

public class ConstructorOverloading {
    String name;
    int age;

    // Default Constructor
    ConstructorOverloading() {
        name = "Unknown";
        age = 0;
    }

    // Parameterized Constructor with name only
    ConstructorOverloading(String name) {
        this.name = name;
        age = 0;
    }

    // Parameterized Constructor with name and age
    ConstructorOverloading(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        ConstructorOverloading p1 = new ConstructorOverloading();
        ConstructorOverloading p2 = new ConstructorOverloading("Alice");
        ConstructorOverloading p3 = new ConstructorOverloading("Bob", 25);

        p1.display();
        p2.display();
        p3.display();
    }
}
