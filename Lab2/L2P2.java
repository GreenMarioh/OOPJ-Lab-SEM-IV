import java.util.Scanner;

class EvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ten numbers");
        int[] arr;
        arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = input.nextInt();
        }
        int [] even;
        int [] odd;
		odd = new int[10];
        int m = 0;
        int n = 0;
        for (int j = 0; j < 10; j++){
            if (arr[j]%2 == 0){
                even[m] = arr[j];
                m++;
            } else {
                odd[n] = arr[j];
                n++;
            }
        }
        int evenSize = even.Length;
        int oddSize = odd.Length;

		
		System.out.println("The numer of even numbers is: "+ evenSize +"and the number of odd numbers is: "+ oddSize);

        }

}
