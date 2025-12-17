### Java Programming Practice: Payment Processing System Using Abstraction and Interfaces

#### Project Description

Design a simple Payment Processing System in Java to practice abstraction and interfaces. The system should support multiple types of payments, including CreditCard, PayPal, and BankTransfer. Each payment type must have its own unique way of processing transactions.

#### Requirements

1. Define an interface called `Payment` with a method `processPayment(double amount)` that all payment types must implement.
2. Create at least three classes that implement the `Payment` interface:

   * `CreditCard` - Processes payment using credit card and displays a confirmation.
   * `PayPal` - Processes payment using PayPal and displays a confirmation.
   * `BankTransfer` - Processes payment using bank transfer and displays a confirmation.
3. Each class should implement the `processPayment` method, providing behavior unique to that payment type.
4. Include a simple method in each class to display a confirmation message when a payment is successfully processed.
5. The main program should allow the user to:

   * Choose a payment type.
   * Enter an amount.
   * Display the corresponding confirmation message.

#### Sample Output

```
Select Payment Method:
1. Credit Card
2. PayPal
3. Bank Transfer

Enter your choice: 2
Enter payment amount: 1500.00

Processing PayPal payment of $1500.0...
Payment successful via PayPal!
```
