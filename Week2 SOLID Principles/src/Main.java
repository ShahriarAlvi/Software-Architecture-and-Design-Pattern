import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Shahriar Alvi", "alam.shahriaralvi@gmail.com");
        System.out.println("Order 1");
        List<Double> orderItems = new ArrayList<>();
        orderItems.add(10.0);
        orderItems.add(20.0);
        orderItems.add(30.0);
        customer.placeOrder(orderItems);

        System.out.println("\nOrder 2");

        OrderService orderService = new OrderService(new DatabaseOrderRepository());
        List<Double> items = new ArrayList<>();
        items.add(15.0);
        items.add(25.0);
        items.add(35.0);
        customer.placeOrder(items);
        Order order = new Order(items);
        orderService.saveOrder(order);
        orderService.deleteOrder(order);
    }
}
