import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentExamResult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter number of subjects: ");
            int numSubjects = scanner.nextInt();
            if (numSubjects == 0) {
                System.out.println("Error: Number of subjects cannot be zero. Cannot calculate average.");
                return;
            }
            if (numSubjects < 0) {
                System.out.println("Error: Number of subjects cannot be negative.");
                return;
            }
            int total = 0;
            for (int i = 1; i <= numSubjects; i++) {
                System.out.print("Enter marks for subject " + i + " (0-100): ");
                int marks = scanner.nextInt();
                if (marks < 0 || marks > 100) {
                    throw new IllegalArgumentException(
                        "Invalid marks: " + marks + ". Marks must be between 0 and 100.");
                }
                total += marks;
            }
            double average = (double) total / numSubjects;
            System.out.println("\n----- Result -----");
            System.out.println("Total marks : " + total);
            System.out.println("Average     : " + average);
            String grade;
            String status;
            if (average >= 90) {
                grade = "A";
                status = "Pass";
            } else if (average >= 75) {
                grade = "B";
                status = "Pass";
            } else if (average >= 60) {
                grade = "C";
                status = "Pass";
            } else if (average >= 50) {
                grade = "D";
                status = "Pass";
            } else {
                grade = "F";
                status = "Fail";
            }
            System.out.println("Grade       : " + grade);
            System.out.println("Status      : " + status);
        } catch (InputMismatchException e) {
            System.out.println("Error: Invalid input! Please enter numbers only.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
