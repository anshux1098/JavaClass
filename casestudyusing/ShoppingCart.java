import java.util.*;
public class ShoppingCart {
    public static void main(String[] args) {
        ArrayList<String> cart = new ArrayList<>();
        cart.add("Milk");
        cart.add("Bread");
        cart.add("Eggs");
        System.out.println("Cart items:");
        for (int i = 0; i < cart.size(); i++) {
            System.out.println(cart.get(i));
        }
        if (cart.contains("Bread")) {
            System.out.println("Bread is in the cart");
        } else {
            System.out.println("Bread is not in the cart");
        }
        cart.remove("Milk");
        System.out.println("After removing Milk:");
        for (int i = 0; i < cart.size(); i++) {
            System.out.println(cart.get(i));
        }
    }
}
