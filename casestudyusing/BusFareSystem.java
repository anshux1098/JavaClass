import java.util.*;
public class BusFareSystem {
    public static void main(String[] args) {
        Vector<Integer> ages = new Vector<>();
        ages.add(3);
        ages.add(10);
        ages.add(30);
        ages.add(65);
        int base = 500;
        int total = 0;
        for (int age : ages) {
            int fare;
            if (age < 5) {
                fare = 0;
            } else if (age <= 12) {
                fare = 250;
            } else if (age <= 59) {
                fare = base;
            } else {
                fare = 350;
            }
            total = total + fare;
            System.out.println("Age: " + age + " Fare: " + fare);
        }
        System.out.println("Total Fare: " + total);
    }
}
