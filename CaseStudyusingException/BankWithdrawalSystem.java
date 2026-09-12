import java.util.InputMismatchException;
import java.util.Scanner;

public class BankWithdrawalSystem {
    public static void main(String[] args) {
        double balance = 10000.0;
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Current Balance: " + balance);
            System.out.print("Enter withdrawal amount: ");
            double withdrawalAmount = scanner.nextDouble();
            if (withdrawalAmount <= 0) {
                throw new IllegalArgumentException("Invalid withdrawal amount! Amount must be greater than 0.");
            }
            if (withdrawalAmount > balance) {
                throw new IllegalArgumentException("Insufficient balance! Your balance is: " + balance);
            }
            balance -= withdrawalAmount;
            System.out.println("Withdrawal successful!");
            System.out.println("Withdrawn amount: " + withdrawalAmount);
            System.out.println("Remaining balance: " + balance);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter a numeric value.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
