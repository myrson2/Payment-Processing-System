import payment_processor.BankTransfer;
import payment_processor.CreditCard;
import payment_processor.PaymentHistory;
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
        PaymentHistory paymentHistory = null;
        
        int choice = 0;
        double payment = 0;
        String discountCode = "";
        boolean isContinue = true;
        
        do{
            paymentMethod();
            System.out.print("Enter a choice: ");
            choice = scan.nextInt();

            switch(choice){
                case 1:
                    System.out.print("Enter payment amount: ");
                    payment = scan.nextDouble();
                    System.out.println("Enter discount code (if any): ");
                    discountCode = scan.nextLine();

                    creditCard = new CreditCard(payment);
                
                    creditCard.displayDetails();
                    break;

                case 2:
                    System.out.print("Enter payment amount: ");
                    payment = scan.nextDouble();
                    System.out.println("Enter discount code (if any): ");
                    discountCode = scan.nextLine();

                    paypal = new Paypal(payment);

                    paypal.displayDetails();
                    break;

                case 3:
                    System.out.print("Enter payment amount: ");
                    payment = scan.nextDouble();
                    System.out.println("Enter discount code (if any): ");
                    discountCode = scan.nextLine();

                    bankTransfer = new BankTransfer(payment);

                    bankTransfer.displayDetails();
                    break;

                case 4:
                    scan.close();
                    break;
            }

            System.out.println("Do you want to process another payment? (yes/no): ");
            String anotherPayment = scan.nextLine();
            isContinue = anotherPayment.equalsIgnoreCase("Yes");

        }while(isContinue);

        //do number 5 in readme.md 

    }
}
