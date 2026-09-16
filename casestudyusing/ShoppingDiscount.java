import java.util.*;

public class ShoppingDiscount {
    public static void main(String[] args) {
        ArrayList<Double> prices = new ArrayList<>();
        prices.add(3000.0);
        prices.add(4000.0);
        prices.add(5000.0);
        double total = 0;
        for (double p : prices) {
            total += p;
        }
        double rate;
        if (total >= 10000) {
            rate = 0.20;
        } else if (total >= 5000) {
            rate = 0.10;
        } else if (total >= 2000) {
            rate = 0.05;
        } else {
            rate = 0;
        }
        double discount = total * rate;
        double finalAmount = total - discount;
        System.out.println("Total: " + total);
        System.out.println("Discount: " + discount);
        System.out.println("Final Amount: " + finalAmount);
    }
}
