package payment_processor;
import java.util.Random;

public class CreditCard implements Payment{
     private double amount;
     Random random = new Random();

    public CreditCard (double amount){
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public double processPayment(double amount) {
        System.out.printf("\nProcessing Credit Card payment of Php %.2f....\n", amount);
        return amount;
    }

    @Override
    public void processValidation(){
        if (amount > 0){
            System.out.println("Payment Successful via Credit Card.\n");
        } else {
            System.out.println("Payment Unsuccessful via Credit Card.\n");
        }
    }

     @Override
    public String generateTransactionID() {
        String transacID = "";
    
        for (int i = 0; i < 2; i++) {
            transacID += (char) ('A' + random.nextInt(26));
        }

        for (int i = 0; i < 6; i++) {
            transacID += random.nextInt(10);
        }
         return transacID;
    }

    @Override
    public void displayDetails(){
        processPayment(amount);
        System.out.println("Transaction ID: " + generateTransactionID());
        processValidation();
    }
}
