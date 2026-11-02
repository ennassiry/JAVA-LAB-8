package interfaceLab;

public class SmsNotificationSender implements NotificationSender {

    private static final int MAX_SMS_LENGTH = 160;

    @Override
    public void sendNotification(String recipient, String message) {
        if (message.length() > MAX_SMS_LENGTH) {
            System.out.println("[SMS] Message trop long, tronque a " + MAX_SMS_LENGTH + " caracteres.");
            message = message.substring(0, MAX_SMS_LENGTH);
        }
        System.out.println("[SMS] Envoi au " + recipient + " : " + message);
    }

    @Override
    public String getChannelType() {
        return "SMS";
    }
}