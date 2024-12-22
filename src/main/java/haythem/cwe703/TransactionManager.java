package haythem.cwe703;

public class TransactionManager {
    private BankAccount fromAccount;
    private BankAccount toAccount;

    public TransactionManager(BankAccount from, BankAccount to) {
        this.fromAccount = from;
        this.toAccount = to;
    }

    public void transfer(double amount) {
        try {
            fromAccount.withdraw(amount);
            toAccount.deposit(amount);
            System.out.println("Transfert de $" + amount + " réussi.");
        } catch (Exception e) {
            System.err.println("Erreur lors du transfert : " + e.getMessage());
            rollback(amount);
        }
    }

    private void rollback(double amount) {
        try {
            System.out.println("Rollback du transfert de $" + amount);
            fromAccount.deposit(amount); // Rétablir le montant retiré
        } catch (Exception e) {
            System.err.println("Erreur lors du rollback : " + e.getMessage());
            // Log ou gestion supplémentaire
        }
    }
}
