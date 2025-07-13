
import java.util.Arrays;
import java.util.Scanner;

class SharedArray {
    private final int[] array;

    public SharedArray(int[] userArray) {
        this.array = userArray.clone(); 
    }

    public int[] getArray() {
        return array.clone(); 
    }

    public synchronized void displayArray(String order, int[] sortedArray) {
        System.out.println(order + " Order: " + Arrays.toString(sortedArray));
    }
}

class SortArrayThread extends Thread {
	final SharedArray sharedArray;
     boolean ascending;

    public SortArrayThread(SharedArray sharedArray, boolean ascending) {
        this.sharedArray = sharedArray;
        this.ascending = ascending;
    }

    
    public void run() {
        int[] arrayToSort = sharedArray.getArray();
        if (ascending) {
            Arrays.sort(arrayToSort);
            sharedArray.displayArray("Ascending", arrayToSort);
        } else {
            Arrays.sort(arrayToSort);
            reverseArray(arrayToSort);
            sharedArray.displayArray("Descending", arrayToSort);
        }
    }

    private void reverseArray(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] userArray = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            userArray[i] = scanner.nextInt();
        }
        scanner.close();

        SharedArray sharedArray = new SharedArray(userArray);

        Thread ascendingThread = new SortArrayThread(sharedArray, true);
        Thread descendingThread = new SortArrayThread(sharedArray, false);

        ascendingThread.start();
        descendingThread.start();
    }
}
