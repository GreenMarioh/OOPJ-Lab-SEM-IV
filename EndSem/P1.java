import java.util.*;
import java.io.*;

 class Car {
    String model;
    int speed;

    public Car(String model, int speed) {
        this.model = model;
        this.speed = speed;
    }
}

public class P1{
public static void main(String[] args) {
    Car lmao = new Car("AAAA", 69420);
    System.out.println(lmao.model + " " + lmao.speed);
}
}