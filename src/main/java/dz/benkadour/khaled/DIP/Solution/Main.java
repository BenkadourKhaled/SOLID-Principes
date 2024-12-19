package dz.benkadour.khaled.DIP.Solution;

public class Main {
     // Utilisation de la notification par email
     Notifier emailNotifier = new EmailNotification();
     OrderService emailOrderService = new OrderService(emailNotifier);
     emailOrderService.processOrder("12345");

     // Utilisation de la notification par SMS
     Notifier smsNotifier = new SMSNotification();
     OrderService smsOrderService = new OrderService(smsNotifier);
     smsOrderService.processOrder("67890");
}
