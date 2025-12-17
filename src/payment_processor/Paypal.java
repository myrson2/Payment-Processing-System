package payment_processor;

public class Paypal implements Payment{
    private double amount;

    public Paypal(double amount){
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public double processPayment(double amount) {
        System.out.printf("\nProcessing Paypal payment of Php %.2f....\n", amount);
        return amount;
    }

    @Override
    public void processValidation(){
        if (amount > 0){
            System.out.println("Payment Successful via Paypal.\n");
        } else {
            System.out.println("Payment Unsuccessful via Paypal.\n");
        }
    }
}