interface Payment {
    void pay(double amount);
}

class CreditCardPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " by Credit Card");
    }
}

class UPIPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " by UPI");
    }
}

class NetBankingPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " by Net Banking");
    }
}

public class PaymentSystem {
    public static void main(String args[]) {
        Payment p;
        p = new CreditCardPayment();
        p.pay(2000);
        p = new UPIPayment();
        p.pay(1500);
        p = new NetBankingPayment();
        p.pay(3000);
    }
}
