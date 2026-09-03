
import java.util.Scanner;

class BankAccount {

    private int accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance. Withdrawal denied.");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
    }

    public void displayBalance() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }
}

public class casestudy2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter account number");
        int accNo = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter account holder name");
        String name = scanner.nextLine();

        System.out.println("Enter initial balance");
        double balance = scanner.nextDouble();

        BankAccount account = new BankAccount(accNo, name, balance);

        System.out.println("Enter amount to deposit");
        double depositAmount = scanner.nextDouble();
        account.deposit(depositAmount);

        System.out.println("Enter amount to withdraw");
        double withdrawAmount = scanner.nextDouble();
        account.withdraw(withdrawAmount);

        account.displayBalance();
    }
}
