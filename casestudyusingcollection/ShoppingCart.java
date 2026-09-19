import java.util.*;

public class ShoppingCart {

    public static void addProduct(List<String> cart, String product) {
        // Write your code
        cart.add(product);
    }

    public static void removeProduct(List<String> cart, String product) {
        // Write your code
        cart.remove("Mouse");
    }

    public static int countProduct(List<String> cart, String product) {
        if(cart.isEmpty())
        {
            return 0;
        }
        int c=0;
        for(int i=0;i<cart.size();i++)
        {
            if(cart.get(i)=="Mouse")
            {
                c++;
            }
        }
        // Write your code
        return c;
    }

    public static void displayCart(List<String> cart) {
        

        for(int i=0;i<cart.size();i++)
        {
            System.out.print(cart.get(i)+" ");
        }
        System.out.println();
        // Write your code
    }

    public static void main(String[] args) {

        List<String> cart = new ArrayList<>();

        addProduct(cart, "Laptop");
        addProduct(cart, "Mouse");
        addProduct(cart, "Keyboard");
        addProduct(cart, "Mouse");
        addProduct(cart, "Mouse");

        System.out.println("Cart:");
        displayCart(cart);

        System.out.println("Mouse quantity: "
                + countProduct(cart, "Mouse"));

        removeProduct(cart, "Mouse");

        System.out.println("After removing one Mouse:");
        displayCart(cart);
    }
}

