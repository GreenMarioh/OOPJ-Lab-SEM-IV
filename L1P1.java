import java.util.Scanner;
class Biodata{
public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		Scanner input1 = new Scanner(System.in);
		String name, sec, branch;
		int roll;
		System.out.println("Enter your Name");
		name = input.nextLine(); 
		
		System.out.println("Enter your section");
		sec = input1.nextLine();
		System.out.println("Enter your branch");
		branch = input1.nextLine();
		System.out.println(" Enter your Roll number");
		roll = input.nextInt(); // using nextInt for scanning input for integer
		
		System.out.println("Your name is: " +name);
		System.out.println("Your Roll number is: " +roll);
		System.out.println("Your Section is: " +sec);
		System.out.println("Your branch is: " +branch);
	}
}