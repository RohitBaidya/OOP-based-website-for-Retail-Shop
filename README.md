# Retail Shop Management System - Java Console Application

![Java](https://img.shields.io/badge/Java-17%2B-blue)
![License](https://img.shields.io/badge/License-MIT-green)

A complete Java console application for managing a retail shop's inventory and customer purchases using Object-Oriented Programming principles.

## Features

### Product Management
- 🏷️ Pre-loaded products with categories (Electronics, Shoes, Makeup, Others)
- 📝 Detailed product specifications (display sizes, expiry dates, etc.)
- 📊 Real-time stock tracking and updates

### Customer Operations
- 🛒 Add products to cart with stock validation
- 👀 View cart contents with detailed product information
- 💰 Checkout system with total calculation
- ⚡ Direct purchase option (bypass cart)

### Category Navigation
- 🔍 Browse products by category
- ℹ️ Detailed product information display
- 🔄 Return to main menu functionality

## Class Structure

| Class | Description |
|-------|-------------|
| `Product` | Represents items with ID, name, price, category, specifications and stock |
| `Shop` | Maintains product catalog with search by category/ID |
| `Customer` | Handles all customer operations (cart management, purchases) |
| `MainApp` | Provides console interface and manages program flow |

## Getting Started

### Prerequisites
- Java JDK 17 or later
- Basic terminal/command line knowledge

### Installation & Execution
1. Clone the repository or download the source files
2. Compile all Java files:
```bash
javac *.java
```
3. Run the application:
```bash
java MainApp
```

## Sample Product Data

| ID | Name | Price | Category | Stock | Key Specifications |
|----|------|-------|----------|-------|--------------------|
| 1 | Laptop | $750.00 | Electronics | 5 | 15.6" display, Intel i5, 8GB RAM |
| 2 | Shoes | $49.99 | Shoes | 20 | Sizes: 7-10 |
| 3 | Phone | $500.00 | Electronics | 10 | Snapdragon 8 Gen 2, 12GB RAM |
| 4 | Lipstick | $25.00 | Makeup | 50 | Expiry: Dec 2026 |

## Usage Examples

1. **Browse Products by Category**:
```
Choose: 1
Available Categories:
1. Shoes
2. Electronics
3. Makeup
4. Others
```

2. **Add to Cart**:
```
1. Laptop - $750.0 [Electronics] | Stock: 5
    Display: 15.6 inch
    Processor: Intel i5
    RAM: 8GB
    Storage: 512GB SSD

Enter product ID to interact with: 1
[1] Add to Cart
[2] Buy Now
Choose option: 1
Laptop added to cart.
```

3. **Checkout**:
```
Total paid: $750.0
```

## Future Enhancements
- 🗃️ Database integration for persistent storage
- 👨‍💼 Admin panel for inventory management
- 💳 Payment gateway integration
- 📈 Sales reporting and analytics
- � Discount and coupon system

## License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Acknowledgments
- Built using core Java concepts
- Follows OOP design principles
- Simple console interface for easy testing

Enjoy shopping! 🛍️
