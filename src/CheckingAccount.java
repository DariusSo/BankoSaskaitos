public class CheckingAccount extends BankAccount{

    double transactionFee;
    public CheckingAccount(double balance, double transactionFee) {
        super(balance);
        this.transactionFee = transactionFee;
    }

    @Override
    public double calculateInterest() {
        return 0;
    }

}
