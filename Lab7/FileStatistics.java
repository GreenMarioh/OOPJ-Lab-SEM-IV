import java.io.*;
import java.util.Scanner;

public class FileStatistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the name of the text file: ");
        String fileName = scanner.nextLine();
        
        int charCount = 0;
        int lineCount = 0;
        int wordCount = 0;
        
        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            
            String line;
            
            while ((line = bufferedReader.readLine()) != null) {
                lineCount++;
                charCount += line.length();
                
                if (!line.trim().isEmpty()) {
                    String[] words = line.trim().split("\\s+");
                    wordCount += words.length;
                }
            }
            
            bufferedReader.close();
            fileReader.close();
            
            System.out.println("\nFile Statistics:");
            System.out.println("Number of characters: " + charCount);
            System.out.println("Number of lines: " + lineCount);
            System.out.println("Number of words: " + wordCount);
            
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found - " + fileName);
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
        
        scanner.close();
    }
}
