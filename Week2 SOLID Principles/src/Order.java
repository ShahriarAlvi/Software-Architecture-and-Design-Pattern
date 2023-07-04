import java.util.List;

class Order {
    private List<Double> items;

    public Order(List<Double> items) {
        this.items = items;
    }

    public double calculateTotalAmount() {
        return items.stream().mapToDouble(Double::doubleValue).sum();
    }

    public void addItem(double item) {
        items.add(item);
    }

    public void removeItem(double item) {
        items.remove(item);
    }
}
