import java.util.Map;

public class Product {
    public int id;
    public String name;
    public double price;
    public String category;
    public Map<String, String> details;
    public int stock;

    public Product(int id, String name, double price, String category, Map<String, String> details, int stock) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
        this.details = details;
        this.stock = stock;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(id).append(". ").append(name)
          .append(" - $").append(price)
          .append(" [").append(category).append("] | Stock: ").append(stock).append("\n");

        if (!details.isEmpty()) {
            for (Map.Entry<String, String> entry : details.entrySet()) {
                sb.append("    ").append(entry.getKey()).append(": ").append(entry.getValue()).append("\n");
            }
        }
        return sb.toString();
    }
}
