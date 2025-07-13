import java.util.Scanner;
class InvalidHourException extends Exception{
	public InvalidHourException(String mssg){
		super(mssg);
	}
}

class InvalidMinuteException extends Exception{
	public InvalidMinuteException(String mssg){
		super(mssg);
	}
}

class InvalidSecondException extends Exception{
	public InvalidSecondException(String mssg){
		super(mssg);
	}
}

public class time{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Hours");
		int hour = scanner.nextInt();
		System.out.println("Enter Minutes");
		int min = scanner.nextInt();
		System.out.println("Enter Seconds");
		int sec = scanner.nextInt();
		int flag = 0;
		/* try{
			if (hour > 24 || hour < 0){
				throw new InvalidHourException("Hour value is invalid");
			}
			if (min < 0 || min >=60){
				throw new InvalidMinuteException("Minutes value is invalid");
			}
			if (sec < 0 || sec >= 60){
				throw new InvalidSecondException("Seconds value is invalid");
			}
			System.out.println("Time is "+hour+ " : "+min +" : " +sec );
	}
	catch(InvalidHourException | InvalidSecondException | InvalidMinuteException e){
		System.out.println("Exception found: " + e.getMessage()); */
		try{
			if (hour > 23 || hour < 0){
				flag = 1;
				throw new InvalidHourException("Hour value is invalid");
			}
		}
		catch(InvalidHourException e){
			System.out.println("Exception Found: "+ e.getMessage());
		}	
		try{
			if (min >= 60 || min < 0){
				flag = 1;
				throw new InvalidMinuteException("Minute value is invalid");
			}
		}
		catch(InvalidMinuteException e){
			flag =1;
			System.out.println("Exception Found: "+ e.getMessage());
		}
		try{
			if (sec >= 60 || sec < 0){
				flag =1;
				throw new InvalidSecondException("Minute value is invalid");
			}
		}
		catch(InvalidSecondException e){
			System.out.println("Exception Found: "+ e.getMessage());
		}
		
		if (flag!= 1){
		System.out.println("Time is "+hour+ " : "+min +" : " +sec );
		}
	}
}
