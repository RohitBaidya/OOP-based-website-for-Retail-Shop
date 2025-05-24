import java.util.*;

public class Customer {
    public String name;
    private List<Product> cart = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public void addToCart(Product p) {
        if (p.stock > 0) {
            cart.add(p);
            p.stock--;
            System.out.println(p.name + " added to cart.");
        } else {
            System.out.println("Sorry, " + p.name + " is out of stock.");
        }
    }

    public void viewCart() {
        if (cart.isEmpty()) {
            System.out.println("Cart is empty.");
        } else {
            for (Product p : cart) {
                System.out.println(p);
            }
        }
    }

    public double checkout() {
        double total = 0;
        for (Product p : cart) {
            total += p.price;
        }
        cart.clear();
        return total;
    }

    public double buyDirect(Product p) {
        if (p.stock > 0) {
            p.stock--;
            System.out.println("You bought: " + p.name);
            return p.price;
        } else {
            System.out.println("Sorry, " + p.name + " is out of stock.");
            return 0;
        }
    }
}
