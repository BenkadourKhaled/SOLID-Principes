package dz.benkadour.khaled.DIP.Solution;

public class OrderService {
    private Notifier notifier;

    // Injection de dépendance via le constructeur
    public OrderService(Notifier notifier) {
        this.notifier = notifier;
    }

    public void processOrder(String order) {
        System.out.println("Processing order: " + order);
        notifier.send("Order " + order + " has been processed.");
    }
}