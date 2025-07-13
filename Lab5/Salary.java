import java.util.Scanner;
interface Salary
{
	double earnings(double bs);
	double deductions(double bs);
	double bonus(double bs);
}
abstract class manager implements Salary
{
	public double earnings(double bs)
	{
		return bs + (0.8*bs) +(0.15*bs);
	}
	public double deductions(double bs)
	{
		return (0.12*bs);
	}
}
class substaff extends manager
{
	public double bonus(double bs)
	{
		return (0.5*bs);
	}
}
public class Salary
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your basic salary");
		double bs= sc.nextDouble();
		substaff obj = new substaff();
		System.out.println("\nEarnings = "+obj.earnings(bs));
		System.out.println("Deduction = "+obj.deductions(bs));
		System.out.println("Bonus = "+obj.bonus(bs));
	}
}
