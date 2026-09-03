
import java.util.Scanner;

class Employee {

    private int id;
    private String name;
    private double basicSalary;
    private double hra;
    private double da;
    private double grossSalary;

    public Employee(int id, String name, double basicSalary) {
        this.id = id;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    public void calculateSalary() {
        hra = basicSalary * 0.2;
        da = basicSalary * 0.1;
        grossSalary = basicSalary + hra + da;
    }

    public void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("Gross Salary: " + grossSalary);
    }
}

public class casestudy3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Id of the Employee");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter the name of the Employee");
        String name = sc.nextLine();

        System.out.println("Enter the salary of the Employee");
        double salary = sc.nextDouble();

        Employee emp = new Employee(id, name, salary);
        emp.calculateSalary();
        emp.displayDetails();
    }
}
