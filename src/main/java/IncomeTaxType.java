public class IncomeTaxType extends TaxType {
    @Override
    public double calculateTaxFor(double amount) {
        return 0.13 * amount;
    }
}
