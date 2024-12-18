package dz.benkadour.khaled.OCP.Solution;

public class CreditCardPayment implements PaymentMethod {

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of " + amount);
        // Logic to process credit card payment
    }

    
}
