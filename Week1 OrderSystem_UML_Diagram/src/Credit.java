import java.util.Date;

public class Credit extends Payment {
    private String number;
    private String type;
    private Date expDate;

    public Credit(String number, String type, Date expDate){
        this.number = number;
        this.type = type;
        this.expDate = expDate;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing card payment for: " + amount + ", cardNumber: " + number);
    }

    public boolean authorized(){
        return false;
    }

}
