import java.util.Scanner;

// Base class for 2D shapes
class TwoDShape {
    double length;
    double width;

    // Constructor for 2D shape
    public TwoDShape(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Method to calculate area
    public double calculateArea() {
        return length * width;
    }

    // Method to calculate cost for 2D plastic
    public double calculateCost() {
        return calculateArea() * 40; // Cost per square ft is Rs 40
    }
}

// Subclass for 3D shapes
class ThreeDShape extends TwoDShape {
    double height;

    // Constructor for 3D shape
    public ThreeDShape(double length, double width, double height) {
        super(length, width);
        this.height = height;
    }

    // Method to calculate volume
    public double calculateVolume() {
        return length * width * height;
    }

    // Method to calculate cost for 3D plastic
    @Override
    public double calculateCost() {
        return calculateVolume() * 60; // Cost per cubic ft is Rs 60
    }
}

// Main class to execute the program
public class PlasticCostCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the type of plastic (2D/3D): ");
        String type = scanner.nextLine();

        if (type.equalsIgnoreCase("2D")) {
            System.out.print("Enter length (in ft): ");
            double length = scanner.nextDouble();

            System.out.print("Enter width (in ft): ");
            double width = scanner.nextDouble();

            TwoDShape sheet = new TwoDShape(length, width);
            System.out.println("The cost of the 2D plastic sheet is: Rs " + sheet.calculateCost());
        } else if (type.equalsIgnoreCase("3D")) {
            System.out.print("Enter length (in ft): ");
            double length = scanner.nextDouble();

            System.out.print("Enter width (in ft): ");
            double width = scanner.nextDouble();

            System.out.print("Enter height (in ft): ");
            double height = scanner.nextDouble();

            ThreeDShape box = new ThreeDShape(length, width, height);
            System.out.println("The cost of the 3D plastic box is: Rs " + box.calculateCost());
        } else {
            System.out.println("Invalid type entered.");
        }

        scanner.close();
    }
}
