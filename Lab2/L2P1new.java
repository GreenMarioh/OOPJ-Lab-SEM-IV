import java.util.Scanner;
public class largest3
{
	public static void main(String[] args)
	{
	
		if(args.length==3)
		{
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int c=Integer.parseInt(args[2]);
		
		int d;
		if(a>=b&&a>=c)
		{
			 d=a;
		}
		else if( b>=a&&b>=c)
		{
			d=b;
		}
		else
		{
			d=c;
		}
		System.out.println("The largest number is " +d);
		}
		else
		{
		System.out.println("Command line arguments not entered");
		}
	}
}
