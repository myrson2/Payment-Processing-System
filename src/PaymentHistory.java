import java.util.ArrayList;

import payment_processor.Payment;

public class PaymentHistory {
    private ArrayList<Payment> payments = new ArrayList<>();

    PaymentHistory(ArrayList<Payment> payments){
        this.payments = payments;
    }

    public void allTransanctions(Payment transactions){
        payments.add(transactions);
    }

    public void displayHistory(){
        System.out.println("\n====== History of Payments =====\n");
        for (int i = 0; i < payments.size(); i++) {
            Payment payment = payments.get(i);

            System.out.println(i+1 + ". " + payment.paymentType() + " | Amount: " + payment.processPayment(0) + " | Transcation ID: " + payment.generateTransactionID() + " | Date: " + payment.dateTime());
        }
    }
 }
