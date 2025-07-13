import java.util.Scanner;
class Day{
public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int day;
		System.out.println("Enter the weekday");
		day = input.nextInt();
		if (day <= 31 && day > 0){
		int mod = day%7;
		String result = "";
		switch(mod){
			case 0:
				result = "Sunday";
			case 1:
				result = "Monday";
			case 2:
				result = "Tuesday";
			case 3:
				result = "Wednesday";
			case 4:
				result = "Thursday";
			case 5:
				result = "Friday";
			case 6:
				result = "Saturday";
		}
		System.out.println(result);
		}
		else {
			System.out.println("Not a valid date");
		}
}
}