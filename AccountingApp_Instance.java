// Instance는 하나의 Class를 복제해서 서로 다른 Data의 값과 서로 같은 Method를 가진 복제본을 만드는 것이다.

class Accounting1{
    public double ValueOfSupply = 10000.0;
    public double VatRate;
    public double ExpenseRate;

    public void Print() {
        System.out.println("Value of supply : "+ValueOfSupply);
        System.out.println("VAT : "+getVAT());
        System.out.println("Total : "+getTotal());
        System.out.println("Expense : "+getExpense());
        System.out.println("Income : "+getIncome());
        System.out.println("Dividend : "+getDividend1());
        System.out.println("Dividend : "+getDividend2());
        System.out.println("Dividend : "+getDividend3());
    }

    private double getDividend1() {
        return getIncome()*0.5;
    }

    private double getDividend2() {
        return getIncome()*0.3;
    }

    private double getDividend3() {
        return getIncome()*0.2;
    }

    private double getIncome() {
        return ValueOfSupply-getExpense();
    }

    private double getExpense() {
        return ValueOfSupply*ExpenseRate;
    }

    private double getTotal() {
        return ValueOfSupply+getVAT();
    }

    private double getVAT() {
        return ValueOfSupply*VatRate;
    }
}

public class AccountingApp_Instance {

    public static void main(String[] args) {

        // instance
        Accounting1 a1 = new Accounting1();
        a1.ValueOfSupply = 10000.0;
        a1.VatRate = 0.1;
        a1.ExpenseRate = 0.3;
        a1.Print();

        Accounting1 a2 = new Accounting1();
        a2.ValueOfSupply = 5000.0;
        a2.VatRate = 0.05;
        a2.ExpenseRate = 0.1;
        a2.Print();

        a1.Print();
        a2.Print();

    }

}