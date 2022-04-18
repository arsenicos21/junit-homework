public class ProgressiveTaxType extends TaxType {
    @Override
    public double calculateTaxFor(double amount) {
        if (amount >= 100_000) {
            return 0.15 * amount;
        } else {
            return 0.10 * amount;
        }
    }
}
