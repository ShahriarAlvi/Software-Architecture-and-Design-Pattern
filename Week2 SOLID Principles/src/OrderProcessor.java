// Liskov Substitution Principle (LSP)

class OrderProcessor {
    public double calculateTotal(Order order, Discount discount) {
        double totalAmount = order.calculateTotalAmount();
        double discountedAmount = discount.applyDiscount(totalAmount);
        return discountedAmount;
    }
}
