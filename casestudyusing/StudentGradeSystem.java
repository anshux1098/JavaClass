import java.util.*;

public class StudentGradeSystem {
    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<>();
        marks.add(95);
        marks.add(82);
        marks.add(70);
        marks.add(65);
        marks.add(55);
        int total = 0;
        for (int m : marks) {
            total += m;
        }
        double percentage = total / 5.0;
        String grade;
        if (percentage >= 90) {
            grade = "A";
        } else if (percentage >= 75) {
            grade = "B";
        } else if (percentage >= 60) {
            grade = "C";
        } else if (percentage >= 50) {
            grade = "D";
        } else {
            grade = "Fail";
        }
        System.out.println("Total: " + total);
        System.out.println("Percentage: " + percentage);
        System.out.println("Grade: " + grade);
    }
}
