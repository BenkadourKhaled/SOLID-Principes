package dz.benkadour.khaled.DIP.Solution;

public class SMSNotification implements Notifier {
    @Override
    public void send(String message) {
        System.out.println("Sending SMS: " + message);
    }
}