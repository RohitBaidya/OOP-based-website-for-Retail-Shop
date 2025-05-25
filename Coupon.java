import java.util.HashMap;
import java.util.Map;

public class Coupon {
    private static final Map<String, Double> coupons = new HashMap<>();

    static {
        coupons.put("DISCOUNT10", 10.0); // 10% off
        coupons.put("SAVE20", 20.0);     // 20% off
        coupons.put("HALFPRICE", 50.0);  // 50% off
    }

    public static boolean isValid(String code) {
        return coupons.containsKey(code.toUpperCase());
    }

    public static double getDiscountPercentage(String code) {
        return coupons.getOrDefault(code.toUpperCase(), 0.0);
    }

    public static double applyDiscount(double originalPrice, String code) {
        if (!isValid(code)) return originalPrice;
        double discount = getDiscountPercentage(code);
        return originalPrice - (originalPrice * discount / 100);
    }

    public static void listAvailableCoupons() {
        System.out.println("Available Coupons:");
        for (Map.Entry<String, Double> entry : coupons.entrySet()) {
            System.out.println("  " + entry.getKey() + " - " + entry.getValue() + "% OFF");
        }
    }
}
