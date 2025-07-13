import java.util.Scanner;
class PrintName{
public static void main(String[] args){
	Scanner input = new Scanner(System.in); 
	String str1, str2;
	System.out.println("Enter first name");
	str1 = input.nextLine();
	System.out.println("Enter second name");
	str2 = input.nextLine();
	System.out.println(str2 + " " + str1);
}
	
}
