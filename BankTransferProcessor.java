package interfaceLab;

public class BankTransferProcessor implements PaymentProcessor {

    private final String accountNumber;

    public BankTransferProcessor(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public boolean processPayment(double amount) {
        if (amount <= 0) {
            System.out.println("Erreur : Montant invalide pour le virement.");
            return false;
        }
        System.out.println("Virement de " + amount + "DH vers le compte " + accountNumber + " initie.");
        
        System.out.println("Virement confirme.");
        return true;
    }

    @Override
    public String getPaymentMethod() {
        return "Virement Bancaire";
    }
}