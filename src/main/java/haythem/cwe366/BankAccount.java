package haythem.cwe366;

public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Méthode pour déposer de l'argent
    public void deposit(double amount) {
        double newBalance = balance + amount;

        // Simuler un délai pour illustrer la condition de course
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        balance = newBalance;
    }

    // Méthode pour retirer de l'argent
    public void withdraw(double amount) {
        if (balance >= amount) {
            double newBalance = balance - amount;

            // Simuler un délai pour illustrer la condition de course
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            balance = newBalance;
        } else {
            System.out.println("Solde insuffisant pour le retrait de $" + amount);
        }
    }

    public double getBalance() {
        return balance;
    }
    // Méthode pour déposer de l'argent avec synchronisation
    public synchronized void depositSync(double amount) {
        double newBalance = balance + amount;

        // Simuler un délai pour illustrer la synchronisation
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        balance = newBalance;
    }

    // Méthode pour retirer de l'argent avec synchronisation
    public synchronized void withdrawSync(double amount) {
        if (balance >= amount) {
            double newBalance = balance - amount;

            // Simuler un délai pour illustrer la synchronisation
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            balance = newBalance;
        } else {
            System.out.println("Solde insuffisant pour le retrait de $" + amount);
        }
    }

}
