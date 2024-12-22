package haythem.realibilty.cwe704;

public class DebitTransaction extends Transaction {
    private double amount;

    public DebitTransaction(double amount) {
        this.amount = amount;
    }

    @Override
    public void execute() {
        System.out.println("Debiting amount: $" + amount);
    }
}