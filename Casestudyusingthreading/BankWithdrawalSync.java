class BankAccount {
    int balance = 10000;

    synchronized void withdraw(String name, int amount) {
        System.out.println(name + " trying to withdraw " + amount);
        if (amount <= balance) {
            System.out.println(name + " withdrawal successful.");
            balance = balance - amount;
            System.out.println(name + " completed. Remaining balance is " + balance);
        } else {
            System.out.println(name + " insufficient balance. Available balance is " + balance);
        }
    }
}

class BankCustomer extends Thread {
    BankAccount account;
    String name;
    int amount;

    BankCustomer(BankAccount account, String name, int amount) {
        this.account = account;
        this.name = name;
        this.amount = amount;
    }

    public void run() {
        account.withdraw(name, amount);
    }
}

public class BankWithdrawalSync {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        BankCustomer t1 = new BankCustomer(account, "Ravi", 7000);
        BankCustomer t2 = new BankCustomer(account, "Sita", 5000);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted.");
        }

        System.out.println("Final balance is " + account.balance);
    }
}
