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

    public double checkoutWithCoupon(String code) {
        double total = 0;
        for (Product p : cart) {
            total += p.price;
        }

        double discounted = Coupon.applyDiscount(total, code);
        cart.clear();

        if (discounted < total) {
            System.out.printf("Coupon applied! You saved $%.2f\n", total - discounted);
        } else {
            System.out.println("Invalid or no coupon applied.");
        }

        return discounted;
    }

    public double buyDirectWithCoupon(Product p, String code) {
        if (p.stock > 0) {
            p.stock--;
            double discountedPrice = Coupon.applyDiscount(p.price, code);
            System.out.println("You bought: " + p.name);
            if (discountedPrice < p.price) {
                System.out.printf("Coupon applied! You saved $%.2f\n", p.price - discountedPrice);
            }
            return discountedPrice;
        } else {
            System.out.println("Sorry, " + p.name + " is out of stock.");
            return 0;
        }
    }

    public double checkout() {
        return checkoutWithCoupon("");
    }
}
