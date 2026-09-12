import java.util.Scanner;

class BankAccount {
    String accNo;
    String holderName;
    double balance;

    BankAccount(String accNo, String holderName, double balance) {
        this.accNo = accNo;
        this.holderName = holderName;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Withdrawal not allowed. Insufficient balance.");
        } else {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        }
    }

    void displayBalance() {
        System.out.println("Account No: " + accNo);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Balance: " + balance);
    }
}

public class BankAccountDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount acc = new BankAccount("1001", "Rahul", 10000);

        acc.displayBalance();
        acc.deposit(5000);
        acc.withdraw(2000);
        acc.withdraw(20000);
        acc.displayBalance();

        sc.close();
    }
}
