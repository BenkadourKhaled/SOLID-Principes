package dz.benkadour.khaled.OCP.Solution;

public class PayPalPayment implements PaymentMethod {

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of " + amount);
        // Logic to process PayPal payment
    }
    
}
