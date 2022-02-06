public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double sumCredit = 1_000_000;
        double creditTime = 1;
        double monthlyPayment = service.calculate(sumCredit, creditTime);
        System.out.println("Ежемесячный платеж равен сроком на 1 год: " + monthlyPayment + " ₽ ");

        sumCredit = 1_000_000;
        creditTime = 2;
        monthlyPayment = service.calculate(sumCredit, creditTime);
        System.out.println("Ежемесячный платеж равен сроком на 2 года: " + monthlyPayment + " ₽ ");

        sumCredit = 1_000_000;
        creditTime = 3;
        monthlyPayment = service.calculate(sumCredit, creditTime);
        System.out.println("Ежемесячный платеж равен сроком на 3 года: " + monthlyPayment + " ₽ ");
    }
}
