package haythem.realibilty.cwe704;

public class TransactionServiceVC {
    public void processTransaction(Transaction transaction) {
        if (transaction == null) {
            System.err.println("Transaction is null. Aborting process.");
            return;
        }

        transaction.execute();

        if (transaction instanceof CreditTransaction) {
            CreditTransaction creditTransaction = (CreditTransaction) transaction;
            creditTransaction.applyBonus();
        } else {
            System.out.println("No bonus applicable for this transaction type.");
        }
    }
}
