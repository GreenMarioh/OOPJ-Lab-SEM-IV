import java.util.Scanner;

class Plate {
    double length;
    double width;

    public Plate(double length, double width) {
        this.length = length;
        this.width = width;
        System.out.println("Plate constructor called: Length = " + length + ", Width = " + width);
    }
}

class Box extends Plate {
    double height;

    public Box(double length, double width, double height) {
        super(length, width);
        this.height = height;
        if (height != 0) {
            System.out.println("Box constructor called: Height = " + height);
        }
    }
}

class WoodBox extends Box {
    double thickness;

    public WoodBox(double length, double width, double height, double thickness) {
        super(length, width, height);
        this.thickness = thickness;
        if (thickness != 0) {
            System.out.println("WoodBox constructor called: Thickness = " + thickness);
        }
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length: ");
        double length = scanner.nextDouble();

        System.out.print("Enter width: ");
        double width = scanner.nextDouble();

        System.out.print("Enter height: ");
        double height = scanner.nextDouble();

        System.out.print("Enter thickness: ");
        double thickness = scanner.nextDouble();
        WoodBox woodBox = new WoodBox(length, width, height, thickness);

        scanner.close();
    }
}
