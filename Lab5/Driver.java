import java.util.Scanner;

abstract class student{
	int regnum;
	int roll;
	void getinput(){
		Scanner scanner = new Scanner(System.in);
		System.out.printf("Enter your roll num\n");
		this.roll = scanner.nextInt();
		System.out.printf("Enter your registration num\n");
		this.regnum = scanner.nextInt();
	}
	abstract void course();
}

class kiitian extends student{
	String coursename;
	void course(){
		this.coursename = "B.Tech. (CSE)";		
	}
	
	void display(){
		System.out.println("Roll number: " + this.roll);
		System.out.println("Registration number: " + this.regnum);
		System.out.println("Course: " + this.coursename);
	}	
}

public class Driver{
	public static void main(String[] args){
		kiitian dost = new kiitian();
		dost.getinput();
		dost.course();
		dost.display();
	}
}