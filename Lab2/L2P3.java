import java.util.Scanner;

class Sort {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n;
    System.out.println("Enter the size of array");
    n = input.nextInt();
    System.out.println("Enter " + n + " numbers");

    int[] arr = new int[n];
    int temp;

    for (int i = 0; i < n; i++) {
      arr[i] = input.nextInt();
    }

    for (int i = 0; i < n - 1; i++) {
      for (int j = 0; j < n - i - 1; j++) { 
        if (arr[j] > arr[j + 1]) { 
          temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }

    System.out.println("Sorted Array: ");
    for (int i = 0; i < n; i++) {
      System.out.println(arr[i]);
    }
  }
}