public class OrderDetail {
    private int quantity;
    private Item item;
    private double taxRate;

    public OrderDetail(Item item, int quantity, double taxRate){
        this.quantity = quantity;
        this.item = item;
        this.taxRate = taxRate;
    }

    public double calcSubTotal(){
        return item.getPrice() * quantity;
    }

    public double weight(){
        return item.getShippingWeight() * quantity;
    }

    public double calcTax(){
        return calcSubTotal() * taxRate;
    }

}
