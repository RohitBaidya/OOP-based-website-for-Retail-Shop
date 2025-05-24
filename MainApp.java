import java.util.*;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Customer user = new Customer("sir/madam");

        while (true) {
            System.out.println("\nWelcome, " + user.name + "!");
            System.out.println("1. Select Category");
            System.out.println("2. View Cart");
            System.out.println("3. Checkout");
            System.out.println("4. Exit");
            System.out.print("Choose: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Available Categories:");
                    System.out.println("1. Shoes");
                    System.out.println("2. Electronics");
                    System.out.println("3. Makeup");
                    System.out.println("4. Others");
                    System.out.print("Enter category number: ");
                    int catChoice = sc.nextInt();
                    sc.nextLine();

                    String category = switch (catChoice) {
                        case 1 -> "Shoes";
                        case 2 -> "Electronics";
                        case 3 -> "Makeup";
                        case 4 -> "Others";
                        default -> null;
                    };

                    if (category == null) {
                        System.out.println("Invalid category.");
                        break;
                    }

                    List<Product> categoryProducts = Shop.getProductsByCategory(category);
                    if (categoryProducts.isEmpty()) {
                        System.out.println("No products found in this category.");
                        break;
                    }

                    System.out.println("\n--- Products in category: " + category + " ---");
                    for (Product p : categoryProducts) {
                        System.out.println(p);
                    }

                    while (true) {
                        System.out.println("\nEnter product ID to interact with, or 0 to go back:");
                        int id = sc.nextInt();
                        sc.nextLine();

                        if (id == 0) break;

                        Product selected = Shop.getProductById(id);
                        if (selected == null || !selected.category.equalsIgnoreCase(category)) {
                            System.out.println("Invalid product ID for this category.");
                            continue;
                        }

                        System.out.println("[1] Add to Cart");
                        System.out.println("[2] Buy Now");
                        System.out.println("[Other] Cancel");
                        System.out.print("Choose option: ");
                        int action = sc.nextInt();
                        sc.nextLine();

                        if (action == 1) {
                            user.addToCart(selected);
                        } else if (action == 2) {
                            double paid = user.buyDirect(selected);
                            if (paid > 0) {
                                System.out.println("Paid: $" + paid);
                            }
                        } else {
                            System.out.println("Cancelled.");
                        }
                    }
                    break;

                case 2:
                    user.viewCart();
                    break;

                case 3:
                    double total = user.checkout();
                    System.out.println("Total paid: $" + total);
                    break;

                case 4:
                    System.out.println("Goodbye!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}
