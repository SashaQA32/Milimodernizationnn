public class CreditPaymentService {
    public double calculate(double sumCredit, double creditTime) {
        double interestRate = 9.99;
        double creditTimeMonth = creditTime * 12;
        double paragraph = interestRate / 100 / 12;
        double paragraphOne = Math.pow((1 + (paragraph)), creditTimeMonth);
        double paragraphTwo = paragraphOne - 1;
        double paragraphThree = (paragraph / paragraphTwo) + paragraph;
        double paragraphFour = sumCredit * paragraphThree;
        return paragraphFour;
    }
}
