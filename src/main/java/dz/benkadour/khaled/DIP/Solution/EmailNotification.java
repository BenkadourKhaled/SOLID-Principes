package dz.benkadour.khaled.DIP.Solution;

public class EmailNotification implements Notifier {
    @Override
    public void send(String message) {
        System.out.println("Sending email: " + message);
    }
}