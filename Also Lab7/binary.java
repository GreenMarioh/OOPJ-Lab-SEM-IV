import java.io.*;
import java.util.Scanner;
class binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first file path: ");
        String file1 = sc.nextLine();
        System.out.print("Enter the second file path: ");
        String file2 = sc.nextLine();

        try {
            FileInputStream fis1 = new FileInputStream(file1);
            FileInputStream  fis2 = new FileInputStream(file2);

            int byte1, byte2;
            int position = 0;

            while ((byte1 = fis1.read()) != -1 && (byte2 = fis2.read()) != -1) {
                position++;

                if (byte1 != byte2) {
                    System.out.println("Files differ at byte position: " + position);
                    System.out.println("File1 Byte: " + byte1 + ", File2 Byte: " + byte2);
                    return;
                }
            }
            if (fis1.read() != -1 || fis2.read() != -1) {
                System.out.println("Files differ in size.");
            } else {
                System.out.println("Files are identical.");
            }
            fis1.close();
            fis2.close();

        } catch (IOException e) {
            System.out.println("Error reading files: " + e.getMessage());
        }
    }
}
