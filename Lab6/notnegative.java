import java.util.Scanner;
class NegativeNumberException extends Exception
{
	public NegativeNumberException(String mssg)
	{
		super(mssg);
	}
}
public class notnegative
{
	public static void ProcessInput(int num) throws NegativeNumberException
	{
		if(num<0)
		{
			throw new NegativeNumberException("Negative Number Entered");
		}
		else
		{
			System.out.println("Double value: "+num*2);
		}
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		try
		{
			ProcessInput(num);
		}
		catch( NegativeNumberException e)
		{
			System.out.println("Exception found : "+e.getMessage());
		}
		finally
		{
			System.out.println("Program completed");
		}
	}
}
