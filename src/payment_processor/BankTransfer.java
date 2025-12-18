package payment_processor;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class BankTransfer implements Payment{
    Random random = new Random();
    private double amount;

    public BankTransfer(double amount){
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String paymentType() {
        return "Bank Transfer";
    }

    @Override
    public double processPayment(double amount) {
        return this.amount;
    }

    @Override
    public void processValidation(){
        if (amount > 0){
            System.out.println("Payment Successful via Bank Transfer.\n");
        } else {
            System.out.println("Payment Unsuccessful via Bank Transfer.\n");
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

    @Override
    public String dateTime() {
        LocalDateTime dateTime = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        String dateTransac = dateTime.format(formatter);
        
        return dateTransac;
    }
}
