import java.util.Scanner;

class DiagSum {
    public static void main(String[] args) {
        int [][] arr;
		arr = new int[3][3];
		Scanner input = new Scanner(System.in);
		int leftDi = 0;
		int rightDi = 0;
		System.out.println("Enter your numbers");
		for (int i = 0; i < 3; i++){
			for (int j = 0; j < 3; j++){
				arr[i][j] = input.nextInt();
			}
		}
		
		for (int i = 0; i < 3; i++){
			for (int j = 0; j < 3; j++){
			if ( i == j) {
				leftDi = leftDi + arr[i][j];
				}
				else if (i + j == 2){
					rightDi = rightDi + arr[i][j];
				}
			}
		}
				
		System.out.println("Right sum = " + rightDi + " Left Sum = " + leftDi);
		
	}
}
