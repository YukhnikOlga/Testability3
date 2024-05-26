public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        double percentYear = 9.99; // процентная ставка в год
        int amountCredit = 1_000_000; // сумма кредита
        int months = 12;

        System.out.println(service.calculate(percentYear, amountCredit, months));
        System.out.println(service.calculate(9.99, 1_000_000, 24));
        System.out.println(service.calculate(9.99, 1_000_000, 36));
    }
}