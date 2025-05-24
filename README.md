# Retail Shop Management System (Java Console App)

A simple Java-based console application for managing a retail shop's inventory, customer cart, and checkout process using Object-Oriented Programming (OOP) principles.

## Features

- **Product Management**
  - Pre-loaded products with categories (Electronics, Shoes, Makeup, Others)
  - Detailed product specifications (display, sizes, expiry dates etc.)
  - Real-time stock tracking

- **Customer Operations**
  - Add products to cart with stock validation
  - View cart contents
  - Checkout system with total calculation
  - Direct purchase option (bypass cart)

- **Category Navigation**
  - Browse products by category
  - Detailed product information display

## Class Structure

| Class | Description |
|-------|-------------|
| `Product` | Represents items with ID, name, price, category, specs, and stock |
| `Customer` | Handles cart operations (add/view/checkout) and purchases |
| `Shop` | Product catalog with search by category/ID |
| `MainApp` | Console interface and program flow |

## Code Examples

```java
// Adding product to cart
public void addToCart(Product p) {
    if (p.stock > 0) {
        cart.add(p);
        p.stock--;
        System.out.println(p.name + " added to cart.");
    }
}

// Checking out
public double checkout() {
    double total = 0;
    for (Product p : cart) {
        total += p.price;
    }
    cart.clear();
    return total;
}
