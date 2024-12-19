package dz.benkadour.khaled.DIP.Problem;

public class OrderService {
    private EmailNotification emailNotification;

    public OrderService() {
        this.emailNotification = new EmailNotification();
    }

    public void processOrder(String order) {
        // Traitement de la commande
        System.out.println("Processing order: " + order);
        // Notification par email
        emailNotification.sendEmail("Order " + order + " has been processed.");
    }
}
