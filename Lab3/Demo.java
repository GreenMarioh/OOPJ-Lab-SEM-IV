
import java.util.Scanner;


class Box {
    private double length;
    private double width;
    private double height;


    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }


    public double volume() {
        return length * width * height;
    }
}

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of the box:");
        double length = scanner.nextDouble();

        System.out.println("Enter the width of the box:");
        double width = scanner.nextDouble();

        System.out.println("Enter the height of the box:");
        double height = scanner.nextDouble();


        Box box = new Box(length, width, height);


        double volume = box.volume();
        System.out.println("The volume of the box is: " + volume);

        scanner.close();
    }
}
