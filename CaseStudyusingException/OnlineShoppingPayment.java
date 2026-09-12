import java.util.InputMismatchException;
import java.util.Scanner;

public class OnlineShoppingPayment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter product price: ");
            double price = sc.nextDouble();
            if (price <= 0) {
                throw new IllegalArgumentException("Invalid product price - price must be > 0.");
            }
            System.out.print("Enter quantity: ");
            int quantity = sc.nextInt();
            if (quantity <= 0) {
                throw new IllegalArgumentException("Invalid quantity - quantity must be > 0.");
            }
            System.out.print("Enter discount percentage (0 to 100): ");
            double discountPercent = sc.nextDouble();
            if (discountPercent < 0 || discountPercent > 100) {
                throw new IllegalArgumentException("Invalid discount percentage - must be 0 to 100 only.");
            }
            double total = price * quantity;
            double discountAmount = total * (discountPercent / 100);
            double finalBill = total - discountAmount;
            System.out.print("Enter payment amount: ");
            double payment = sc.nextDouble();
            if (payment < finalBill) {
                throw new IllegalArgumentException("Insufficient payment - payment amount is less than the bill.");
            }
            double change = payment - finalBill;
            System.out.println("\n----- Bill Details -----");
            System.out.println("Product Price  : " + price);
            System.out.println("Quantity       : " + quantity);
            System.out.println("Total          : " + total);
            System.out.println("Discount (" + discountPercent + "%) : " + discountAmount);
            System.out.println("Final Bill     : " + finalBill);
            System.out.println("Payment Amount : " + payment);
            System.out.println("Change to Return : " + change);
            System.out.println("Payment successful. Thank you for shopping!");
        } catch (InputMismatchException e) {
            System.out.println("Invalid input - please enter numbers only.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
