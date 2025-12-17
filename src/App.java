import payment_processor.BankTransfer;
import payment_processor.CreditCard;
import payment_processor.Paypal;

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
        
        int choice = 0;
        double payment = 0;
        
        do{
            paymentMethod();
            System.out.print("Enter a choice: ");
            choice = scan.nextInt();

            switch(choice){
                case 1:
                    System.out.print("Enter payment amount: ");
                    payment = scan.nextDouble();

                    creditCard = new CreditCard(payment);

                    creditCard.processPayment(payment);
                    creditCard.processValidation();
                    break;

                case 2:
                    System.out.print("Enter payment amount: ");
                    payment = scan.nextDouble();

                    paypal = new Paypal(payment);

                    paypal.processPayment(payment);
                    paypal.processValidation();
                    break;

                case 3:
                    System.out.print("Enter payment amount: ");
                    payment = scan.nextDouble();


                    bankTransfer = new BankTransfer(payment);

                    bankTransfer.processPayment(payment);
                    bankTransfer.processValidation();
                    break;

                case 4:
                    scan.close();
                    break;
            }
        }while(choice != 4);
    }
}
