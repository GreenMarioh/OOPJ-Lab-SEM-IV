import java.util.Scanner;
class Grade{
public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int marks;
		System.out.println("Enter your Marks");
		marks = input.nextInt();
		
		if (marks <= 100 && marks > 90){
			System.out.println("O grade");
		}
		else if (marks <= 90 && marks > 80){
			System.out.println("E grade");
		}
		else if (marks <= 80 && marks > 70){
			System.out.println("A grade");
		}
		else if (marks <= 70 && marks > 60){
			System.out.println("B grade");
		}
		else if (marks <= 60){
			System.out.println("C grade");
		}
		else {
			System.out.println("Invalid input");
	}
}
}