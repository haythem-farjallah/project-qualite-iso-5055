package haythem.cwe109;

public class OrderProcessorVC {
    private static final double TAX_RATE = 0.07; // Taxe standard de 7%
    private static final double DISCOUNT_RATE = 0.10; // Remise pour les commandes en gros
    private static final int DISCOUNT_THRESHOLD = 10; // Seuil pour la remise
    private static final double SHIPPING_COST = 5.99; // Frais de port standard

    /**
     * Calcule le prix total de la commande en appliquant les taxes, remises et frais de port.
     *
     * @param itemPrice Prix unitaire de l'article.
     * @param quantity  Quantité commandée.
     * @return Le prix total de la commande.
     */
    public double calculateTotalPrice(double itemPrice, int quantity) {
        double subtotal = itemPrice * quantity;
        double tax = subtotal * TAX_RATE;
        double discount = 0.0;

        if (quantity >= DISCOUNT_THRESHOLD) {
            discount = subtotal * DISCOUNT_RATE;
        }

        double totalPrice = subtotal + tax - discount + SHIPPING_COST;
        return totalPrice;
    }
}
