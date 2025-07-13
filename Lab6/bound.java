import java.util.Scanner;
class bound
	{
		public static void main(String args[]){
			Scanner sc = new Scanner(System.in);	{

			int[] num={1,2,3,4,5};
			System.out.println("Enter the required");
			int i=sc.nextInt();
			try
			{
				System.out.println("Element at index "+i+" is "+num[i]);
			}
			catch(ArrayIndexOutOfBoundsException e) // can also use "Exception" instead "ArrayIndexOutOfBoundsException" because Exception is the parent class.
			{
				System.out.println("Error occured: "+e);
			}
		}
	}
	}
