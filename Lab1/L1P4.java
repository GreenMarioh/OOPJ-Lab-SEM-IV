import java.util.Scanner;
class Palindrome{
public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int number;
		System.out.println("Enter your number");
		number = input.nextInt();
		
		int remainder = 0;
		int newNumber = 0;
		int num1 = number;
		int mod = number%10;
		while (number != 0){
			remainder = number%10;
			number = number%10;
			newNumber = newNumber*10 + remainder;
		
}
if (num1==newNumber){
	System.out.println("Given number is a palindrome");
	
} else {
	System.out.println("Not a palindrome");
}
}
}