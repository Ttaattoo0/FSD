package constructoranddestructor;

public class DestructorOverloading {
    String name;

    // Constructor
    DestructorOverloading(String name) {
        this.name = name;
        System.out.println(name + " object created.");
    }

    // Simulated Destructor 1
    void cleanup() {
        System.out.println(name + " cleanup called.");
    }

    // Simulated Destructor 2 (Overloaded)
    void cleanup(String message) {
        System.out.println(name + " cleanup with message: " + message);
    }

    // Java's actual destructor method (not overloaded)
    @Override
    protected void finalize() {
        System.out.println(name + " is being destroyed by garbage collector.");
    }

    public static void main(String[] args) {
        DestructorOverloading obj1 = new DestructorOverloading("Object1");
        DestructorOverloading obj2 = new DestructorOverloading("Object2");

        // Calling cleanup manually (simulating destructor overloading)
        obj1.cleanup();
        obj2.cleanup("Releasing resources");

        // Suggesting Java to run garbage collection
        obj1 = null;
        obj2 = null;
        System.gc(); // This triggers finalize(), but execution is not guaranteed.
    }
}
