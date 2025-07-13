import java.util.Scanner;

class EvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ten numbers");
        int[] arr = new int[10];

       
        for (int i = 0; i < 10; i++) {
            arr[i] = input.nextInt();
        }

        
        int evenCount = 0;
        int oddCount = 0;
        for (int j = 0; j < 10; j++) {
            if (arr[j] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        
        System.out.println("The number of even numbers is: " + evenCount);
        System.out.println("The number of odd numbers is: " + oddCount);
    }
}