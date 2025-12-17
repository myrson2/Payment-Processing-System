### Advanced Java Programming Practice: Payment Processing System with Abstraction, Interfaces, and Extra Features

#### Project Description

Design an advanced Payment Processing System in Java to practice abstraction, interfaces, and object-oriented design. The system should support multiple types of payments, including CreditCard, PayPal, and BankTransfer, each with its own unique way of processing transactions. Additionally, implement features like payment history tracking, discounts, transaction IDs, and the ability to handle multiple payments in a single session.

#### Requirements

1. Define an interface called `Payment` with a method `processPayment(double amount)` that all payment types must implement.
2. Create at least three classes that implement the `Payment` interface:

   * `CreditCard` - Processes payment using credit card, supports card validation, and displays a confirmation.
   * `PayPal` - Processes payment using PayPal account credentials, applies PayPal-specific fees, and displays a confirmation.
   * `BankTransfer` - Processes payment using bank transfer, generates a transaction ID, and displays a confirmation.
3. Each class should implement the `processPayment` method, providing behavior unique to that payment type.
4. Include a method in each class to display a confirmation message, including a transaction ID and payment date/time.
5. Implement a `PaymentHistory` class to keep track of all processed payments, including payment type, amount, transaction ID, and timestamp.
6. Add functionality to apply discounts or promotional codes for eligible payments.
7. The main program should allow the user to:

   * Choose a payment type.
   * Enter an amount.
   * Optionally enter a discount code.
   * Process multiple payments in one session.
   * Display all confirmation messages and a summary of all processed payments at the end of the session.

#### Sample Output

```
Select Payment Method:
1. Credit Card
2. PayPal
3. Bank Transfer

Enter your choice: 1
Enter payment amount: 2000.00
Enter discount code (if any): SAVE10

Processing Credit Card payment of $1800.0...
Transaction ID: CC123456
Payment successful via Credit Card!

Do you want to process another payment? (yes/no): yes

Select Payment Method:
1. Credit Card
2. PayPal
3. Bank Transfer

Enter your choice: 3
Enter payment amount: 5000.00

Processing Bank Transfer payment of $5000.0...
Transaction ID: BT789012
Payment successful via Bank Transfer!

--- Payment Summary ---
1. Credit Card | Amount: $1800.0 | Transaction ID: CC123456 | Date: 2025-12-17 16:00
2. Bank Transfer | Amount: $5000.0 | Transaction ID: BT789012 | Date: 2025-12-17 16:05
```
