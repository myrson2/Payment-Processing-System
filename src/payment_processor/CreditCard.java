package payment_processor;

public class CreditCard implements Payment{
     private double amount;

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
}
