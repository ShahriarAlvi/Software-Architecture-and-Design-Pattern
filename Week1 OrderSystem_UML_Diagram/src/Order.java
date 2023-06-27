import java.util.Date;
import java.util.List;

public class Order {
    private Date date;
    private String status;
    private Customer customer;
    private List <OrderDetail> orderDetailList;
    private Payment payment;

    public Order(Date date, Customer customer, List<OrderDetail> orderDetailList, Payment payment) {
        this.date = date;
        this.customer = customer;
        this.orderDetailList = orderDetailList;
        this.payment = payment;
    }

    public double calcSubTotal(){
        double subTotal = 0;
        for(OrderDetail orderDetail : orderDetailList){
            subTotal += orderDetail.calcSubTotal();
        }
        return subTotal;
    }

    public double calcTax(){
        double totalTax = 0;
        for(OrderDetail orderDetail : orderDetailList){
            totalTax += orderDetail.calcTax();
        }
        return totalTax;
    }

    public double calcTotal(){
        return calcSubTotal() + calcTax();
    }

    public double calcTotalWeight(){
        double weight = 0;
        for(OrderDetail orderDetail : orderDetailList){
            weight += orderDetail.weight();
        }
        return weight;
    }

    public void processPayment(){
        payment.processPayment(calcTotal());
    }

}
