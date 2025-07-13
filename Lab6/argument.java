class CheckArgument extends Exception
{
	public CheckArgument(String mssg)
	{
		super(mssg);
	}
}
class argument
{
	public static void main(String args[])
	{
		try
		{
			if(args.length < 4)
			{
				throw new CheckArgument("4 numbers not provided");
			}
			else 
			{
				int ans=0;
				for(int i=0;i<args.length;i++)
				{
					int n=Integer.parseInt(args[i]);
					ans+=n*n;
				}
				System.out.println("The result is "+ans);
			}
		}
		catch(CheckArgument e)
		{
			System.out.println("Execption found " +e.getMessage());
		}
		finally
		{
			System.out.println("Program Finished.");
		}
	}
}
