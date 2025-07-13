interface Motor{
	int capacity = 30;
	void run();
	void consume();
}

class WashingMachine implements Motor{
	public void run(){
	System.out.println("Washing Machine is working");
	};
	public void consume(){
	System.out.println("Washing Machine consumes " + capacity + "watts");
	;
	}
}

public class motor{
	public static void main(String[] args){
		WashingMachine bruh = new WashingMachine();
		bruh.run();
		bruh.consume();
	}
}