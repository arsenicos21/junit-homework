public class Main {

    public static void main(String[] args) {
        TaxService taxService = new TaxService();
        TaxType incomeTaxType = new IncomeTaxType();
        TaxType VATaxType = new VATaxType();
        TaxType progressiveTaxType = new ProgressiveTaxType();
        Bill[] payments = new Bill[4];
        payments[0] = new Bill(150000.00, progressiveTaxType, taxService);
        payments[1] = new Bill(10000.00, VATaxType, taxService);
        payments[2] = new Bill(40000.00, incomeTaxType, taxService);
        payments[3] = new Bill(33000.00, progressiveTaxType, taxService);
        for (int i = 0; i < payments.length; ++i) {
            Bill bill = payments[i];
            bill.payTaxes();
        }
    }
}
