package haythem.cwe703;

public class BankingApp {
    public static void main(String[] args) {
        BankAccount accountA = new BankAccount(1000.0);
        BankAccount accountB = new BankAccount(500.0);

        TransactionManager manager = new TransactionManager(accountA, accountB);

        manager.transfer(300.0);
        manager.transfer(800.0); // Cette transaction échouera

        System.out.println("Solde A : $" + accountA.getBalance()); // Attendu : 700.0
        System.out.println("Solde B : $" + accountB.getBalance()); // Attendu : 800.0
    }
}
