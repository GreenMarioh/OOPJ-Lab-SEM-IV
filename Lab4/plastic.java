import java.util.Scanner;

class TwoDShape{
	double length;
	double width;
	
	public TwoDShape(double length, double width){
		this.length = length;
		this.width = width;
	}
	
	public double calcArea(){
		return length * width;
	}
	
	public double cost(){
		return calcArea() * 40;
	}
}

class ThreeDShape extends TwoDShape{
	double height;
	
	public ThreeDShape(double length, double width, double height){
		super(length, width); // super is used to call properties from parent class (super hamesha upar rahega)
		this.height = height;
		}
		
	public double calcVol(){
		return length * width * height;
	}
	
	public double cost(){
		return calcVol() * 60;
	}
}

public class plastic{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.printf("Enter the number of dimensions\n");
		int type = scanner.nextInt();
		
		if (type == 2){
			System.out.printf("Enter Length:\n");
			double length = scanner.nextDouble();
			
			System.out.printf("Enter width:\n");
			double width = scanner.nextDouble();
			
			TwoDShape twoD = new TwoDShape(length, width);
			System.out.println("The cost of 2D shape is: " + twoD.cost());
		}
			else if (type == 3){
				
			System.out.printf("Enter Length:\n");
			double length = scanner.nextDouble();
			
			System.out.printf("Enter width:\n");
			double width = scanner.nextDouble();
			
			System.out.printf("Enter height:\n");
			double height = scanner.nextDouble();
			
			ThreeDShape threeD = new ThreeDShape(length, width, height);
			System.out.println("The cost of 3D shape is: " + threeD.cost());
		
			}
			else {
				System.out.printf("Invalid input");
			}
		
	}
}

