package haythem.cwe109;

public class OrderProcessor {
    public double calculateTotalPrice(double itemPrice, int quantity) {
        double subtotal = itemPrice * quantity;
        double tax = subtotal * 0.07; // Taxe de 7%
        double discount = 0.0;

        if (quantity >= 10) {
            discount = subtotal * 0.1; // Remise de 10%
        }
        double totalPrice = subtotal + tax - discount + 5.99; // Frais de port de 5,99€
        return totalPrice;
    }
}
