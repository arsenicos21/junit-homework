public class VATaxType extends TaxType {
    @Override
    public double calculateTaxFor(double amount) {
        return 0.18 * amount;
    }
}
