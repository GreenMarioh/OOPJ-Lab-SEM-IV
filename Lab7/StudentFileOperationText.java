import java.io.*;
import java.util.*;

public class StudentFileOperationText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            
            FileWriter writer = new FileWriter("students.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(writer);

            System.out.println("Enter number of students: ");
            int n = scanner.nextInt();
            scanner.nextLine(); 

            for (int i = 0; i < n; i++) {
                System.out.println("\nEnter details for student " + (i + 1) + ":");
                
                System.out.print("Enter Roll No: ");
                int rollNo = scanner.nextInt();
                scanner.nextLine(); 
                
                System.out.print("Enter Name: ");
                String name = scanner.nextLine();
                
                System.out.print("Enter Subject: ");
                String subject = scanner.nextLine();
                
                System.out.print("Enter Marks: ");
                int marks = scanner.nextInt();

               
				bufferedWriter.write(rollNo + "," + name + "," + subject + "," + marks);
                bufferedWriter.newLine();
            }

            bufferedWriter.close();
            System.out.println("\nStudent details have been saved to file successfully!");

            
            FileReader reader = new FileReader("students.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);

            System.out.println("\nReading student details from file:");
            String line;
            /*while ((line = bufferedReader.readLine()) != null) {
                String[] studentData = line.split(",");
                System.out.println("Roll No: " + studentData[0] + 
                                 ", Name: " + studentData[1] + 
                                 ", Subject: " + studentData[2] + 
                                 ", Marks: " + studentData[3]);
            } */
            bufferedReader.close();

        } catch (IOException e) {
            System.out.println("Error occurred: " + e.getMessage());
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}
