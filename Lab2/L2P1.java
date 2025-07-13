import java.util.Scanner;

class Largest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three numbers");
        int[] arr;
        arr = new int[3];
        for (int i = 0; i < 3; i++) {
            arr[i] = input.nextInt();
        }
		if (arr.length != 3){
		System.out.println("Error");
		}
		else {
        int largest = arr[0];
        for (int i = 0; i < 3; i++) {
            if (largest < arr[i]) {
                largest = arr[i];
            }
        }
        System.out.println("The Largest number is: " + largest);
		}
    }
}