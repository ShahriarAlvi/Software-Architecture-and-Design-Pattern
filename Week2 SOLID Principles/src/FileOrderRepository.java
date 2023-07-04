class FileOrderRepository implements OrderRepository {
    public void save(Order order) {
        System.out.println("Saving order to a file: " + order);
    }

    public void delete(Order order) {
        System.out.println("Deleting order from a file: " + order);
    }
}
