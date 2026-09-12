import java.util.Scanner;

class EmpDetails {
    int empId;
    String name;
    double basic;
    double hra;
    double da;
    double gross;

    void calculateGross() {
        hra = basic * 0.20;
        da = basic * 0.10;
        gross = basic + hra + da;
    }

    void display() {
        System.out.println("Employee Id: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Basic Salary: " + basic);
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("Gross Salary: " + gross);
    }
}

public class EmployeeSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmpDetails e = new EmpDetails();
        e.empId = 101;
        e.name = "Ravi";
        e.basic = 20000;
        e.calculateGross();
        e.display();
        sc.close();
    }
}
