package interfaceLab;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor cardProcessor = new CreditCardProcessor("4871-17981-1359-1751");
        PaymentService cardService = new PaymentService(cardProcessor);
        cardService.pay(50.0);

        System.out.println("\n" + "=".repeat(40) + "\n");

        PaymentProcessor transferProcessor = new BankTransferProcessor("FR76-8770-6000-0242-3456");
        PaymentService transferService = new PaymentService(transferProcessor);
        transferService.pay(150.0);
        
        // Partie 2
        
        System.out.println("\n" + "=".repeat(40) + "\n");
        System.out.println("TESTS NOTIFICATIONS\n");

        NotificationSender emailSender = new EmailNotificationSender();
        NotificationService emailService = new NotificationService(emailSender);
        emailService.sendWelcomeMessage("m.ennassiry@outlook.com");

        System.out.println("\n");

        NotificationSender smsSender = new SmsNotificationSender();
        NotificationService smsService = new NotificationService(smsSender);
        smsService.sendWelcomeMessage("+2129746389");
    }
}