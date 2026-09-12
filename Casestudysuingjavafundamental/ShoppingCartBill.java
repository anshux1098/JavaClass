import java.util.Scanner;

class Product {
    int id;
    String name;
    double price;
    int quantity;

    double totalCost() {
        return price * quantity;
    }
}

public class ShoppingCartBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product p1 = new Product();
        p1.id = 1;
        p1.name = "Shirt";
        p1.price = 1200;
        p1.quantity = 2;

        Product p2 = new Product();
        p2.id = 2;
        p2.name = "Shoes";
        p2.price = 2500;
        p2.quantity = 1;

        Product p3 = new Product();
        p3.id = 3;
        p3.name = "Watch";
        p3.price = 1500;
        p3.quantity = 1;

        double t1 = p1.totalCost();
        double t2 = p2.totalCost();
        double t3 = p3.totalCost();

        System.out.println(p1.name + " Total: " + t1);
        System.out.println(p2.name + " Total: " + t2);
        System.out.println(p3.name + " Total: " + t3);

        double bill = t1 + t2 + t3;
        double discount = 0;
        if (bill > 5000) {
            discount = bill * 0.10;
        } else {
            discount = 0;
        }
        double payable = bill - discount;

        System.out.println("Bill: " + bill);
        System.out.println("Discount: " + discount);
        System.out.println("Payable: " + payable);
        sc.close();
    }
}
