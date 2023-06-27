public class Item {
    private double shippingWeight;
    private String name;
    private double price;

    public Item(String name, double price, double shippingWeight){
        this.name = name;
        this.price = price;
        this.shippingWeight = shippingWeight;
    }

    public String getName(){
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getShippingWeight() {
        return shippingWeight;
    }
}
