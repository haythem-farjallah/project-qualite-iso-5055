package haythem.realibilty.cwe704;

public class TransactionService {
    public void processTransaction(Transaction transaction) {
        transaction.execute();
        // Conversion incorrecte sans vérification
        CreditTransaction creditTransaction = (CreditTransaction) transaction;
        creditTransaction.applyBonus();
    }
}
