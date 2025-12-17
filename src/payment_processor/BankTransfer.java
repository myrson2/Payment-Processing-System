package payment_processor;

public class BankTransfer implements Payment{
     private double amount;

    public BankTransfer(double amount){
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public double processPayment(double amount) {
        System.out.printf("\nProcessing Credit card payment of Php %.2f....\n", amount);
        return amount;
    }

    @Override
    public void processValidation(){
        if (amount > 0){
            System.out.println("Payment Successful via Bank Transfer.\n");
        } else {
            System.out.println("Payment Unsuccessful via Bank Transfer.\n");
        }
    }
}
