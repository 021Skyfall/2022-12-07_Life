public class AccountingApp_Method {
    public static double ValueOfSupply = 10000.0;
    public static double VatRate;
    public static double ExpenseRate;


    public static void main(String[] args) {

        ValueOfSupply = 10000.0;
        VatRate = 0.1;
        ExpenseRate = 0.3;

        Print();

    }

    private static void Print() {
        System.out.println("Value of supply : "+ValueOfSupply);
        System.out.println("VAT : "+getVAT());
        System.out.println("Total : "+getTotal());
        System.out.println("Expense : "+getExpense());
        System.out.println("Income : "+getIncome());
        System.out.println("Dividend : "+getDividend1());
        System.out.println("Dividend : "+getDividend2());
        System.out.println("Dividend : "+getDividend3());
    }

    private static double getDividend1() {
        return getIncome()*0.5;
    }

    private static double getDividend2() {
        return getIncome()*0.3;
    }

    private static double getDividend3() {
        return getIncome()*0.2;
    }

    private static double getIncome() {
        return ValueOfSupply-getExpense();
    }

    private static double getExpense() {
        return ValueOfSupply*ExpenseRate;
    }

    private static double getTotal() {
        return ValueOfSupply+getVAT();
    }

    private static double getVAT() {
        return ValueOfSupply*VatRate;
    }

}
