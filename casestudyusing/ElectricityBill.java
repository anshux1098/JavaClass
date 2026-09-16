import java.util.*;
public class ElectricityBill {
    public static void main(String[] args) {
        Vector<Integer> units = new Vector<>();
        units.add(80);
        units.add(150);
        units.add(250);
        for (int u : units) {
            double bill;
            if (u <= 100) {
                bill = u * 2;
            } else if (u <= 200) {
                bill = 200 + (u - 100) * 3;
            } else {
                bill = 500 + (u - 200) * 5;
            }
            if (bill > 1000) {
                bill = bill * 1.10;
            }
            System.out.println("Units: " + u + " Bill: " + bill);
        }
    }
}
