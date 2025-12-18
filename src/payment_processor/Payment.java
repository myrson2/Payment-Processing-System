package payment_processor;

public interface Payment {
    public double processPayment(double amount);
    String paymentType();
    void processValidation();
    String generateTransactionID();
    void displayDetails();
    String dateTime();
}
