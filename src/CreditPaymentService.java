public class CreditPaymentService {
    public int calculate(double percentYear, int amountCredit, int months) {
        // X = S * (PM * (1 + PM)^n)) / ((1 + PM)^n -1)
        // a = (1 + PM)
        // b = (1 + PM)^n
        // c = (PM * (1 + PM)^n)) / ((1 + PM)^n -1);
        // Х - размер ежемесячного платежа      -amountPayment
        // S — сумма займа                      -amountCredit
        // P — процентная ставка годовая        -percentYear
        // PM - процентная ставка месячная      -percentMonth
        // n — срок кредитования (в месяцах)    -month

        double percentMonth = percentYear / 12 / 100;
        double a = 1 + percentMonth;
        double b = Math.pow(a, months); // a^n
        double c = percentMonth * b;
        double d = b - 1;
        double e = c / d; // коэффициент аннулитета
        double amountPayment = amountCredit * e;

        return (int) amountPayment;

    }
}

