import payment_processor.BankTransfer;
import payment_processor.CreditCard;
import payment_processor.Payment;
import payment_processor.Paypal;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    static void paymentMethod(){
        System.out.println("Select Payment Method: ");
        System.out.println("1. Credit Card");
        System.out.println("2. Paypal");
        System.out.println("3. Bank Transfer\n");
    }
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        CreditCard creditCard = null;
        BankTransfer bankTransfer = null;
        Paypal paypal = null;
        PaymentHistory paymentHistory = new PaymentHistory(new ArrayList<Payment>());
        
        int choice = 0;
        double payment = 0;
        // String discountCode = "";
        boolean isContinue = true;
        
        do{
            paymentMethod();
            System.out.print("Enter a choice: ");
            choice = scan.nextInt();
            scan.nextLine();

            switch(choice){
                case 1:
                    System.out.print("Enter payment amount: ");
                    payment = scan.nextDouble();
                    scan.nextLine();
                    System.out.println("Enter discount code (if any): ");
                    // discountCode = scan.nextLine();

                    creditCard = new CreditCard(payment);
                
                    System.out.printf("\nProcessing Credit Card payment of Php %.2f....\n", creditCard.processPayment(payment));
                    creditCard.displayDetails();
                    paymentHistory.allTransanctions(creditCard);

                    break;

                case 2:
                    System.out.print("Enter payment amount: ");
                    payment = scan.nextDouble();
                    scan.nextLine();
                    System.out.println("Enter discount code (if any): ");
                    // discountCode = scan.nextLine();

                    paypal = new Paypal(payment);

                    System.out.printf("\nProcessing Credit Card payment of Php %.2f....\n", paypal.processPayment(payment));
                    paypal.displayDetails();
                    paymentHistory.allTransanctions(paypal);

                    break;

                case 3:
                    System.out.print("Enter payment amount: ");
                    payment = scan.nextDouble();
                    scan.nextLine();
                    System.out.println("Enter discount code (if any): ");
                    // discountCode = scan.nextLine();

                    bankTransfer = new BankTransfer(payment);

                    System.out.printf("\nProcessing Credit Card payment of Php %.2f....\n", bankTransfer.processPayment(payment));
                    bankTransfer.displayDetails();
                    paymentHistory.allTransanctions(bankTransfer);

                    break;

                case 4:
                    scan.close();
                    break;
            }

            System.out.print("Do you want to process another payment? (yes/no): ");
            String anotherPayment = scan.nextLine();
            isContinue = anotherPayment.equalsIgnoreCase("Yes");

            if(!isContinue) break;

        }while(isContinue);

        //do number 5 in readme.md 
        paymentHistory.displayHistory();

    }
}
