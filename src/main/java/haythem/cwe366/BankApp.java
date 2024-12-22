package haythem.cwe366;

public class BankApp {
    public static void main(String[] args) throws InterruptedException {
        BankAccount account = new BankAccount(1000.0);

        // Thread pour effectuer des dépôts
        Thread depositThread = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                account.deposit(100.0);
                System.out.println("Déposé $100, solde actuel : $" + account.getBalance());
            }
        });

        // Thread pour effectuer des retraits
        Thread withdrawThread = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                account.withdraw(50.0);
                System.out.println("Retiré $50, solde actuel : $" + account.getBalance());
            }
        });

        depositThread.start();
        withdrawThread.start();

        depositThread.join();
        withdrawThread.join();

        System.out.println("Solde final : $" + account.getBalance());
    }
}
