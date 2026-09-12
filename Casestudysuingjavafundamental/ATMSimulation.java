import java.util.Scanner;

public class ATMSimulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 10000;
        int correctPin = 1234;
        boolean login = false;
        for (int i = 1; i <= 3; i++) {
            System.out.print("Enter PIN: ");
            int pin = sc.nextInt();
            if (pin == correctPin) {
                login = true;
                break;
            } else {
                System.out.println("Wrong PIN. Tries left: " + (3 - i));
            }
        }
        if (login == false) {
            System.out.println("Card blocked.");
            sc.close();
            return;
        }
        System.out.println("1. Withdraw");
        System.out.println("2. Deposit");
        System.out.println("3. Check Balance");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();
        if (choice == 1) {
            System.out.print("Enter amount to withdraw: ");
            int amount = sc.nextInt();
            if (amount <= balance) {
                balance = balance - amount;
                System.out.println("Withdraw successful. Balance: " + balance);
            } else {
                System.out.println("Insufficient balance.");
            }
        } else if (choice == 2) {
            System.out.print("Enter amount to deposit: ");
            int amount = sc.nextInt();
            balance = balance + amount;
            System.out.println("Deposit successful. Balance: " + balance);
        } else if (choice == 3) {
            System.out.println("Balance: " + balance);
        } else {
            System.out.println("Invalid choice.");
        }
        sc.close();
    }
}
