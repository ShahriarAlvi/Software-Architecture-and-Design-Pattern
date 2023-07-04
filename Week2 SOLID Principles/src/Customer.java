import java.util.List;

// Single Responsibility Principle (SRP)
class Customer {
    private String name;
    private String email;

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void placeOrder(List<Double> items) {
        Order order = new Order(items);
        OrderProcessor orderProcessor = new OrderProcessor();
        double discountedAmount = orderProcessor.calculateTotal(order, getDiscountStrategy());
        System.out.println("Order placed for customer: " + getName());
        System.out.println("Total amount: $" + order.calculateTotalAmount());
        System.out.println("Discounted amount: $" + discountedAmount);
    }

    private Discount getDiscountStrategy() {
        if (isVIPCustomer()) {
            return new VIPDiscount();
        } else {
            return new RegularDiscount();
        }
    }

    private boolean isVIPCustomer() {
        return name.startsWith("VIP");
    }
}
