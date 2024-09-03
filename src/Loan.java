
public abstract class Loan {
	protected double rate;

    abstract void getInterestRate(double rate);

    public void calculateLoanPayment(double amount, int years) {
        double monthlyRate = (rate / 100) / 12; // Faiz oran�n� y�zdesel olarak al ve ayl�k faize �evir
        int numberOfPayments = years * 12;
        double installment;
        double total;

        installment = (amount * monthlyRate) / (1 - Math.pow(1 + monthlyRate, -numberOfPayments));
        total = installment * numberOfPayments;

        System.out.println("Monthly installment: " + installment + " and total refund: " + total);
    }
}