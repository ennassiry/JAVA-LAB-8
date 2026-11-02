package interfaceLab;

public class EmailNotificationSender implements NotificationSender {

    @Override
    public void sendNotification(String recipient, String message) {
        if (!recipient.contains("@")) {
            System.out.println("[EMAIL] Erreur : Adresse invalide : " + recipient);
            return;
        }
        System.out.println("[EMAIL] Envoi du message a " + recipient + " : " + message);
    }

    @Override
    public String getChannelType() {
        return "Email";
    }
}