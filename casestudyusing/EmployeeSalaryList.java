import java.util.*;
public class EmployeeSalaryList {
    public static void main(String[] args) {
        ArrayList<Integer> salaries = new ArrayList<>();
        salaries.add(30000);
        salaries.add(45000);
        salaries.add(60000);
        salaries.add(80000);
        System.out.println("Salaries:");
        for (int i = 0; i < salaries.size(); i++) {
            System.out.println(salaries.get(i));
        }
        int max = salaries.get(0);
        int total = 0;
        for (int i = 0; i < salaries.size(); i++) {
            if (salaries.get(i) > max) {
                max = salaries.get(i);
            }
            total = total + salaries.get(i);
        }
        double avg = (double) total / salaries.size();
        System.out.println("Max salary: " + max);
        System.out.println("Total salary: " + total);
        System.out.println("Average salary: " + avg);
    }
}
