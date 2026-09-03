
import java.util.Scanner;

class Product {

    private int productId;
    private String productName;
    private double price;
    private int quantity;
    private double totalCost;

    public Product(int productId, String productName, double price, int quantity) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.totalCost = price * quantity;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void displayProduct() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + totalCost);
        System.out.println("--------------------------");
    }
}

public class casestudy4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of products");
        int n = sc.nextInt();

        Product[] products = new Product[n];
        double totalBill = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Enter Product ID");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter Product Name");
            String name = sc.nextLine();

            System.out.println("Enter Price");
            double price = sc.nextDouble();

            System.out.println("Enter Quantity");
            int qty = sc.nextInt();

            Product p = new Product(id, name, price, qty);
            products[i] = p;
            totalBill += p.getTotalCost();
        }

        System.out.println("============================");
        System.out.println("Product Details:");
        for (int i = 0; i < n; i++) {
            products[i].displayProduct();
        }

        System.out.println("Total Bill before discount: " + totalBill);

        if (totalBill > 5000) {
            double discount = totalBill * 0.10;
            totalBill -= discount;
            System.out.println("Discount Applied: " + discount);
        }

        System.out.println("Final Bill: " + totalBill);
    }
}
