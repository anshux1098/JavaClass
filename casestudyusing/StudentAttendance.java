import java.util.*;
public class StudentAttendance {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        students.add("Ravi");
        students.add("Sita");
        students.add("Amit");
        System.out.println("Student List:");
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }
        if (students.contains("Sita")) {
            System.out.println("Sita is present");
        } else {
            System.out.println("Sita is absent");
        }
        students.remove("Amit");
        System.out.println("After removing Amit:");
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }
        System.out.println("Total students: " + students.size());
    }
}
