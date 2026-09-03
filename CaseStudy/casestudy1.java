import java.util.Scanner;

class casestudy1 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter name of the student: ");
            String name = scanner.nextLine();

            int[] marks = new int[5];
            int sum = 0;

            System.out.println("Enter marks for 5 subjects (0-100):");
            for (int i = 0; i < 5; i++) {
                System.out.print("Subject " + (i + 1) + ": ");
                marks[i] = scanner.nextInt();

                // basic validation
                if (marks[i] < 0 || marks[i] > 100) {
                    System.out.println("Invalid marks! Must be 0-100.");
                    return;
                }
                sum += marks[i];
            }

            double per = sum / 5.0;

            System.out.println("\n--- Result ---");
            System.out.println("Name: " + name);
            System.out.println("Total: " + sum + "/500");
            System.out.println("Percentage: " + per + "%");

            String grade;
            boolean failed;

            if (per >= 90) {
                grade = "A+";
                failed = false;
            } else if (per >= 80) {
                grade = "A";
                failed = false;
            } else if (per >= 70) {
                grade = "B";
                failed = false;
            } else if (per >= 60) {
                grade = "C";
                failed = false;
            } else if (per >= 50) {
                grade = "D";
                failed = false;
            } else {
                grade = "F";
                failed = true;
            }

            System.out.println("Grade: " + grade);
            System.out.println(failed ? "Status: Failed" : "Status: Passed");
        }
    }
}
