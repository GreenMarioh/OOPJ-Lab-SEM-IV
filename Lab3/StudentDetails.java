import java.util.Scanner;

class Student {
    int rollNo;
    String name;
    double cgpa;

    public void readDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Roll No: ");
        rollNo = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter CGPA: ");
        cgpa = sc.nextDouble();
    }

    public void displayDetails() {
        System.out.println("Roll: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + cgpa);
    }
}

public class StudentDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();
        Student[] students = new Student[n];

       
        for (int i = 0; i < n; i++) {
            students[i] = new Student();
            System.out.println("Enter details of students " + (i + 1));
            students[i].readDetails();
        }

        
        int lowestCgpaIndex = 0;
        for (int i = 1; i < n; i++) {
            if (students[i].cgpa < students[lowestCgpaIndex].cgpa) {
                lowestCgpaIndex = i;
            }
        }

       
        System.out.println("Details of all students:");
        for (int i = 0; i < n; i++) {
            students[i].displayDetails();
            System.out.println();
        }

        System.out.println("Student with lowest CGPA:");
        students[lowestCgpaIndex].displayDetails();

        sc.close();
    }
}