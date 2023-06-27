public class Cash extends Payment {
    float cashTendered;

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing cash for: " + amount);
    }
}
