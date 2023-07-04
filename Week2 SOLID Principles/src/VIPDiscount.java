class VIPDiscount implements Discount {
    public double applyDiscount(double amount) {
        return amount * 0.8; // 20% discount
    }
}
