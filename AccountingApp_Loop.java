public class AccountingApp_Loop {
    public static void main(String[] args) {

        double ValueOfSupply = 10000.0;
        double VatRate = 0.1;
        double ExpenseRate = 0.3;
        double VAT = ValueOfSupply*VatRate;
        double Total = ValueOfSupply+ValueOfSupply*VatRate;
        double Expense = ValueOfSupply*ExpenseRate;
        double Income = ValueOfSupply-Expense;

        System.out.println("Value of supply : "+ValueOfSupply);
        System.out.println("VAT : "+VAT);
        System.out.println("Total : "+Total);
        System.out.println("Expense : "+Expense);
        System.out.println("Income : "+Income);

        double[] DividendRates = new double[3];
        DividendRates[0] = 0.5;
        DividendRates[1] = 0.3;
        DividendRates[2] = 0.2;

        int i = 0;
        while(i < DividendRates.length) {
            System.out.println("Dividend : "+Income*DividendRates[i]);
            i = i + 1;
        }
    }
}
