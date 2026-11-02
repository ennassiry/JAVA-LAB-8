package interfaceLab;

public interface NotificationSender {

    
    void sendNotification(String recipient, String message);

    
    String getChannelType();
}