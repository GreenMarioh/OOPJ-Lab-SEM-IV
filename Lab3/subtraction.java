public class subtraction {
    int a = 63;
    int b = 22;

    void subtract() {
        System.out.println("63 - 22 = " + (a - b));
    }

    int subtract(int a, int b) {
        return a - b;
    }

    double subtract(double a, double b) {
        return a - b;
    }

    public static void main(String[] args) {
        subtraction o = new subtraction();
        o.subtract();
        System.out.println(o.subtract(3, 1));
        System.out.println(o.subtract(22.33, 9.9));
    }
}