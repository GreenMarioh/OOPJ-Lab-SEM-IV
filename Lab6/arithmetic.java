import java.util.Scanner;
class arithmetic
{
public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Numerator");
	int num=sc.nextInt();
	System.out.println("Enter the Denominator");
	int den=sc.nextInt();
	try
	{
		int ans=num/den;
		System.out.println("Result is "+ans);
	}
	catch(ArithmeticException e)
	{
		System.out.println("Exception caught: denominator cannot be zero");
	}
	finally
	{
		System.out.println("Program completed");
	}
}
}

