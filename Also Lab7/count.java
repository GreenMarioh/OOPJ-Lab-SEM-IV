import java.util.Scanner;
import java.io.*;
class count
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the file name and with extension");
		String str = sc.nextLine();
		int countchar=0,countline=0,countword=0;
		try
		{
		File file = new File(str);
		if(!file.exists())
		{
			System.out.println("Entered file does not exists");
			System.exit(1);
		}
		FileReader f= new FileReader(file);
		BufferedReader fw=new BufferedReader(f);
		String line;
		while ((line = fw.readLine())!=null)
		{
			countline++;
			countchar+=line.length();
			countword+=line.split("\\s+").length;
		}
		System.out.println("Number of lines : "+countline);
		System.out.println("Number of character : "+countchar);
		System.out.println("Number of words : "+countword);
		fw.close();
		}
		catch( IOException e)
		{
			System.out.println(e.getMessage());
		}
	}
}

