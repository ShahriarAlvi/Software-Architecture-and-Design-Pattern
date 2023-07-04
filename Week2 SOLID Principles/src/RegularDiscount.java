class RegularDiscount implements Discount {
    public double applyDiscount(double amount) {
        return amount * 0.9; // 10% discount
    }
}
