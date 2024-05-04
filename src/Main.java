public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int amountCredit = 1_000_000; // сумма кредита
        double percentYear = 9.99; // процентная ставка в год
        int month = 12;

       // for (int month = 12; month <= 36; month += 12);}

        //int amountPayment = service.calculate(amountCredit, month, percentYear);
        //System.out.println("Кредит на 12 мес. Размер ежемесячного платежа: " + amountPayment + " рублей.");

        System.out.println(service.calculate(amountCredit, month, percentYear));
        System.out.println(service.calculate(1_000_000, 24, 9.99));
        System.out.println(service.calculate(1_000_000, 36, 9.99));
    }

}