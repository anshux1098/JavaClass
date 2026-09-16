import java.util.*;
public class ATMTransaction {
    public static void main(String[] args) {
        int balance = 20000;
        int[] w = {5000, 3000, 8000, 6000};
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < w.length; i++) {
            if (w[i] <= balance) {
                balance -= w[i];
                s.push(w[i]);
                System.out.println("Withdrawal successful: " + w[i] + " Balance: " + balance);
            } else {
                System.out.println("Insufficient balance for withdrawal: " + w[i]);
            }
        }
        System.out.println("Stack: " + s);
        if (!s.isEmpty()) {
            System.out.println("Latest transaction: " + s.peek());
        }
        System.out.println("Final Balance: " + balance);
    }
}
