import java.io.*;
import java.util.Scanner;

class binary {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the name of the first file:");
		String file1 = sc.nextLine();
		System.out.println("Enter the name of the second file:");
		String file2 = sc.nextLine();
		
		try {
			FileInputStream f1 = new FileInputStream(file1);
			FileInputStream f2 = new FileInputStream(file2);
			int byte1, byte2;
			int pos = 0;
			
			while ((byte1 = f1.read()) != -1 && (byte2 = f2.read()) != -1){
				pos++;
				if(byte1 != byte2){
					System.out.println("Different files at position: "+ pos);
					System.out.println("Byte1 position: "+byte1 + "\nByte 2 position: " +byte2);
					return;
				}
			}
			if (f1.read() != -1 || f1.read() != -1) {
                System.out.println("Files differ in size.");
            } else {
                System.out.println("Files are identical.");
            }
            f1.close();
            f1.close();
		} catch (IOException e){
			System.out.println("Error reading files: "+ e.getMessage());
		}
		
	}
}