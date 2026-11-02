package interfaceLab;

public class NotificationService {

    private final NotificationSender sender;

    public NotificationService(NotificationSender sender) {
        this.sender = sender;
    }

    public void sendWelcomeMessage(String recipient) {
        String message = "Bienvenue ! Votre compte a ete cree avec succes.";
        System.out.println("Envoi via canal : " + sender.getChannelType());
        sender.sendNotification(recipient, message);
    }
}