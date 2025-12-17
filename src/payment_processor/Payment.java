package payment_processor;

public interface Payment {
    public double processPayment(double amount);
    
    void processValidation();
}
