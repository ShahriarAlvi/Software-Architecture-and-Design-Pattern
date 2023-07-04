class DatabaseOrderRepository implements OrderRepository {
    public void save(Order order) {
        System.out.println("Saving order to the database: " + order);
    }

    public void delete(Order order) {
        System.out.println("Deleting order from the database: " + order);
    }
}
