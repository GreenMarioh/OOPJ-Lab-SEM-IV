import java.util.Scanner;

class Rectangle {
    private int length;
    private int breadth;

    
    public Rectangle() {
        length = 0;
        breadth = 0;
    }

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int calculateArea() {
        return length * breadth;
    }
}

public class rectanglearea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length and breadth: ");
        int length = scanner.nextInt();
        int breadth = scanner.nextInt();

        Rectangle rect = new Rectangle(length, breadth);
        int area = rect.calculateArea();

        System.out.println("Area of the rectangle: " + area);

        scanner.close();
    }
}