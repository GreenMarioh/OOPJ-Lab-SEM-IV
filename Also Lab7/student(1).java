import java.io.*;
import java.util.Scanner;

public class student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fileName = "student_details.txt";

        try {
            System.out.print("Enter Student Roll No: ");
            int rollNo = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Student Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Subject: ");
            String subject = sc.nextLine();

            System.out.print("Enter Marks: ");
            int marks = sc.nextInt();

            FileWriter fw = new FileWriter(fileName);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Roll No: " + rollNo + "\n");
            bw.write("Name: " + name + "\n");
            bw.write("Subject: " + subject + "\n");
            bw.write("Marks: " + marks + "\n");
            bw.close();
            System.out.println("\nStudent details saved successfully.\n");

            System.out.println("Reading student details from file...\n");
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();

        } catch (IOException e) {
            System.out.println("Error while handling the file: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
