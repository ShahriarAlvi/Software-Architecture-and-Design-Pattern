public class Check extends Payment{
    private String name;
    private String bankID;

    public Check(String name, String bankID){
        this.name = name;
        this.bankID = bankID;
    }

    public void processPayment(double amount){
        System.out.println("Processing check payment for: " + amount + ", bankID: " + bankID);
    }

    public boolean authorized(){
        return false;
    }
}
