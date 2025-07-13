import java.util.Scanner;

class Occ {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		int n;
		System.out.println("Enter the size of array");
		n = input.nextInt();
        System.out.println("Enter " + n +" numbers");
        int[] arr;
		int temp;
		
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        for (int i = 0; i < n; i++){
			for (int j = 1; j < n -1; j++){
				if (arr[j] < arr[j+1]){
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					
				}
		}
        }
		boolean[] visited=new boolean[n];
		System.out.println("The occurrence of numbers are:");
		for(int i=0;i<n;i++)
		{
			if(visited[i])
			{
				continue;
			}
			int count =1;
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]==arr[j])
				{
				count++;
				visited[j]=true;
				}
			}
			System.out.println(arr[i]+" = "+count);
		}
	}
		}



