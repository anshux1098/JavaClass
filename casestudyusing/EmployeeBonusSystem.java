import java.util.*;

public class EmployeeBonusSystem {
    public static void main(String[] args) {
        ArrayList<Double> salaries = new ArrayList<>();
        salaries.add(85000.0);
        salaries.add(55000.0);
        salaries.add(35000.0);
        salaries.add(20000.0);
        for (double salary : salaries) {
            double rate;
            if (salary >= 80000) {
                rate = 0.15;
            } else if (salary >= 50000) {
                rate = 0.10;
            } else if (salary >= 30000) {
                rate = 0.05;
            } else {
                rate = 0;
            }
            double bonus = salary * rate;
            double revised = salary + bonus;
            System.out.println("Salary: " + salary);
            System.out.println("Bonus: " + bonus);
            System.out.println("Revised Salary: " + revised);
        }
    }
}
