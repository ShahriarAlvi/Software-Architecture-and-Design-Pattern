import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class MainClass {

    public static void main(String[] args) {

        Customer customer = new Customer("Shahriar", "Dhaka");

        Item item1 = new Item("Chicken", 220.00, 7);
        Item item2 = new Item("Fish", 300.00, 5);

        OrderDetail orderDetail1 = new OrderDetail(item1, 7, 0.15);
        OrderDetail orderDetail2 = new OrderDetail(item2, 5, 0.20);

        List<OrderDetail> orderDetailList = new ArrayList<>();

        orderDetailList.add(orderDetail1);
        orderDetailList.add(orderDetail2);

        Payment payment = new Check("Shahriar", "87651010");

        Order order = new Order( new Date(2023,05,29) ,customer,orderDetailList, payment);

        order.processPayment();

        System.out.println("Payment processed for order total of " + order.calcTotal());


    }
}
