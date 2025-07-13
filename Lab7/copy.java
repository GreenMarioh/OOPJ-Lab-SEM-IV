import java.io.*;
import java.util.Scanner;

public class copy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the source file path: ");
        String sourceFile = scanner.nextLine();

        System.out.print("Enter the destination file path: ");
        String destinationFile = scanner.nextLine();

        copyUsingCharacterStream(sourceFile, destinationFile);

        copyUsingByteStream(sourceFile, destinationFile);

        scanner.close();
    }

    public static void copyUsingCharacterStream(String source, String destination) {
        try (FileReader fr = new FileReader(source);
             FileWriter fw = new FileWriter(destination)) {

            int ch;
            while ((ch = fr.read()) != -1) {
                fw.write(ch);
            }
            System.out.println(" File copied successfully using Character Stream!");

        } catch (IOException e) {
            System.out.println(" Error copying using Character Stream: " + e.getMessage());
        }
    }

    public static void copyUsingByteStream(String source, String destination) {
        try (FileInputStream fis = new FileInputStream(source);
             FileOutputStream fos = new FileOutputStream(destination)) {

            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
            System.out.println(" File copied successfully using Byte Stream!");

        } catch (IOException e) {
            System.out.println(" Error copying using Byte Stream: " + e.getMessage());
        }
    }
}
