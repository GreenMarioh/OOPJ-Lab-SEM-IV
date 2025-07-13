abstract class Vehicle{
    abstract void start();

}

class Car extends Vehicle{
    String name;

    public Car(String name){
        this.name = name;

    }
    void start(){
        System.out.println(name + " is starting");
    }
}
class Bike extends Vehicle{
    void start(){
        System.out.println("Bike is Starting");
    }
}

public class P2 {
    public static void main(String[] args) {
        Vehicle v1 = new Car("DefaultCarName");
        Vehicle v2 = new Bike();
        v1.start();
        v2.start();
    }
}
