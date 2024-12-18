package dz.benkadour.khaled.OCP.problem;

public class PaymentProcessor {

    public void processPayment(String paymentType, double amount) {
        if (paymentType.equals("CreditCard")) {
            System.out.println("Processing credit card payment of " + amount);
            // Logic to process credit card payment
        } else if (paymentType.equals("PayPal")) {
            System.out.println("Processing PayPal payment of " + amount);
            // Logic to process PayPal payment
        } else {
            throw new IllegalArgumentException("Unsupported payment type");
        }
    }
    
}
