package haythem.realibilty.cwe704;

public class CreditTransaction extends Transaction {
    private double amount;

    public CreditTransaction(double amount) {
        this.amount = amount;
    }

    @Override
    public void execute() {
        System.out.println("Crediting amount: $" + amount);
    }

    public void applyBonus() {
        System.out.println("Applying bonus for credit transaction");
    }
}