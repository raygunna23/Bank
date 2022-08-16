class CheckingAccount extends Customer {
    private  double CheckingBalance;

    CheckingAccount (String Lname, String Fname, String theEmail, double balance) {
        LastName = Lname;
        FirstName = Fname;
        Email = theEmail;
        CheckingBalance = balance;
        BankBalance += CheckingBalance;
        NumberOfCustomers++;

    }
    double getCheckingBalance() {
        return CheckingBalance;
    }
    void makeDeposit(double Amount) {
        CheckingBalance += Amount;
        Transactions++;
        BankBalance += Amount;

    }
    void makeWithdraw(double Amount) {
        CheckingBalance -= Amount;
        Transactions++;
        BankBalance -= Amount;

        if (CheckingBalance < 0) {
            CheckingBalance -= 25;
        }
    }

}
