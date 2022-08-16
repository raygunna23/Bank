class LoanAccount extends Customer {
    private double LoanBalance;

    LoanAccount (String TheLname, String TheFname, String theEmail, double Lbalance) {
        LastName = TheLname;
        FirstName = TheFname;
        Email = theEmail;
        LoanBalance = Lbalance;

    }

    double getLoanBalance() {
        return LoanBalance;
    }
    void takeLoan(double LoanAmt) {
        BankBalance -= LoanAmt;
        LoanBalance +=LoanAmt;
        Transactions++;
    }
    void makePayment(double payAmt) {
        BankBalance += payAmt;
        LoanBalance -=payAmt;
        Transactions++;

        if (LoanBalance <=0) {
            System.out.println("\nCONGRATS ON PAYING OFF YOUR LOAN! :-)");
        }
    }
}
