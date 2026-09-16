import java.util.*;
public class StudentResultVector {
    public static void main(String[] args) {
        Vector<Integer> marks = new Vector<>();
        marks.add(95);
        marks.add(80);
        marks.add(65);
        marks.add(55);
        marks.add(30);
        int sum = 0;
        int pass = 0;
        for (int m : marks) {
            sum = sum + m;
            String result;
            if (m >= 90) {
                result = "Outstanding";
            } else if (m >= 75) {
                result = "Distinction";
            } else if (m >= 60) {
                result = "First Division";
            } else if (m >= 50) {
                result = "Second Division";
            } else {
                result = "Fail";
            }
            if (m >= 50) {
                pass++;
            }
            System.out.println("Marks: " + m + " Result: " + result);
        }
        int total = marks.size();
        int failed = total - pass;
        double avg = (double) sum / total;
        System.out.println("Total Students: " + total);
        System.out.println("Passed: " + pass);
        System.out.println("Failed: " + failed);
        System.out.println("Average: " + avg);
    }
}
