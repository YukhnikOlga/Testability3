public class CreditPaymentService {
    public int calculate(int amountCredit, int month, double percentYear) {
        // X = S * (PM * (1 + PM)^n)) / ((1 + PM)^n ) -1)
        // a = (1 + PM)
        // b = (1 + PM)^n
        // c = (PM * (1 + PM)^n)) / ((1 + PM)^n ) -1);
        // Х - размер ежемесячного платежа      -amountPayment
        // S — сумма займа                      -amountCredit
        // P — процентная ставка годовая        -percentYear
        // PM - процентная ставка месячная      -percentMonth
        // n — срок кредитования (в месяцах)    -month

        double percentMonth = percentYear / month / 100;
        double a = 1 + percentMonth;
        double b = Math.pow(a, month); // a^n
        double c = (percentMonth * b) / (b - 1);
        double amountPayment = amountCredit * c;
        return (int) amountPayment;

    }
}

