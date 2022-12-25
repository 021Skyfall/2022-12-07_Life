public class AccountingApp_Array {
    public static void main(String[] args) {

    double ValueOfSupply = 10000.0;
    double VatRate = 0.1;
    double ExpenseRate = 0.3;
    double VAT = ValueOfSupply*VatRate;
    double Total = ValueOfSupply+ValueOfSupply*VatRate;
    double Expense = ValueOfSupply*ExpenseRate;
    double Income = ValueOfSupply-Expense;

    double[] DividendRates = new double[3];
    DividendRates[0] = 0.5;
    DividendRates[1] = 0.3;
    DividendRates[2] = 0.2;

    double Dividend1 = Income*DividendRates[0];
    double Dividend2 = Income*DividendRates[1];
    double Dividend3 = Income*DividendRates[2];

    System.out.println("Value of supply : "+ValueOfSupply);
    System.out.println("VAT : "+VAT);
    System.out.println("Total : "+Total);
    System.out.println("Expense : "+Expense);
    System.out.println("Income : "+Income);
    System.out.println("Dividend : "+Dividend1);
    System.out.println("Dividend : "+Dividend2);
    System.out.println("Dividend : "+Dividend3);
    }
}
