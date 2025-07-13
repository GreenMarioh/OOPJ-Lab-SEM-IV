// Base class: Apple
class Apple {
    // show() method in Apple class
    public void show() {
        System.out.println("This is the show() method of the Apple class.");
    }
}

// Derived class: Banana (inherits from Apple)
class Banana extends Apple {
    // show() method in Banana class
    @Override
    public void show() {
        System.out.println("This is the show() method of the Banana class.");
    }
}

// Derived class: Cherry (inherits from Apple)
class Cherry extends Apple {
    // show() method in Cherry class
    @Override
    public void show() {
        System.out.println("This is the show() method of the Cherry class.");
    }
}

// Main class to demonstrate Dynamic Method Dispatch
public class DynamicMethod{
    public static void main(String[] args) {
        // Reference of type Apple pointing to different objects
        Apple appleRef;

        // Pointing to an Apple object
        appleRef = new Apple();
        appleRef.show();

        // Pointing to a Banana object
        appleRef = new Banana();
        appleRef.show();

        // Pointing to a Cherry object
        appleRef = new Cherry();
        appleRef.show();
    }
}
