import java.util.*;

public class Shop {
    public static List<Product> products = Arrays.asList(
        new Product(1, "Laptop", 750.00, "Electronics", Map.of(
            "Display", "15.6 inch", "Processor", "Intel i5", "RAM", "8GB", "Storage", "512GB SSD"), 5),

        new Product(2, "Shoes", 49.99, "Shoes", Map.of(
            "Available Sizes", "7, 8, 9, 10"), 20),

        new Product(3, "Phone", 500.00, "Electronics", Map.of(
            "Processor", "Snapdragon 8 Gen 2", "RAM", "12GB", "Storage", "256GB"), 10),

        new Product(4, "Lipstick", 25.00, "Makeup", Map.of(
            "Expiry Date", "Dec 2026"), 50),

        new Product(5, "Notebook", 5.00, "Others", Map.of(), 100),

        new Product(6, "Smartwatch", 199.99, "Electronics", Map.of(
            "Waterproof", "Yes", "Battery Life", "7 days"), 8),

        new Product(7, "Foundation", 35.00, "Makeup", Map.of(
            "Expiry Date", "June 2025"), 30)
    );

    public static List<Product> getProductsByCategory(String category) {
        List<Product> result = new ArrayList<>();
        for (Product p : products) {
            if (p.category.equalsIgnoreCase(category)) {
                result.add(p);
            }
        }
        return result;
    }

    public static Product getProductById(int id) {
        for (Product p : products) {
            if (p.id == id) return p;
        }
        return null;
    }
}
