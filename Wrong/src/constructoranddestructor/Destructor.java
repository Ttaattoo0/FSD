package constructoranddestructor;

class DestructorExample {
    private static DestructorExample obj1;
	private static DestructorExample obj2;

	// Constructor
    DestructorExample() {
        System.out.println("Object created");
    }

    // Destructor (finalize method)
    protected void finalize() {
        System.out.println("Object destroyed");
    }

    public static void main(String[] args) {
        setObj1(new DestructorExample());
        setObj2(new DestructorExample());
        
        // Making objects eligible for garbage collection
        setObj1(null);
        setObj2(null);

        // Requesting garbage collection
        System.gc();
    }

	public static DestructorExample getObj1() {
		return obj1;
	}

	public static void setObj1(DestructorExample obj1) {
		DestructorExample.obj1 = obj1;
	}

	public static DestructorExample getObj2() {
		return obj2;
	}

	public static void setObj2(DestructorExample obj2) {
		DestructorExample.obj2 = obj2;
	}
}
