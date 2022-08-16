/*
Raymean Burns 04/22/21

This bank project will allow you to set up
checking accounts and loan accounts.

 */

import java.awt.*;
import java.text.DecimalFormat;
import java.util.*;


public class bank {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###,##0.0");

        ArrayList<CheckingAccount> Check = new ArrayList<CheckingAccount>();
        Check.add(new CheckingAccount("Smith", "Will", "WS@yahoo.com", 20000));
        Check.add(new CheckingAccount("James", "Lebron", "Lebron.James@gmail.com", 100000));
        Check.add(new CheckingAccount("Curry", "Steph", "Steph.C@gmail.com", 50000));

       ArrayList<LoanAccount> Loan = new ArrayList<LoanAccount>();
       Loan.add(new LoanAccount("Anthony", "Carmelo","C.Anthony@gmail.com", 10000));
       Loan.add(new LoanAccount("Harden", "James","R.W@gmail.com", 15000));
       Loan.add(new LoanAccount("Decaprio", "Leonardo", "decaprio.l@yahoo.com", 5000));


        int Choice = 0;
        while (Choice != 8) {
            System.out.println("$$$$$ Bank Of The Wealthy $$$$$");
            System.out.println();
            System.out.println("1: Bank Information");
            System.out.println("2: Print Checking Accounts");
            System.out.println("3: Make a Deposit");
            System.out.println("4: Make a Withdraw");
            System.out.println("5: Print Loan Accounts");
            System.out.println("6  Get a Loan");
            System.out.println("7: Make a Payment");
            System.out.println("8: Exit");
            System.out.print("Enter your choice: ");
            Choice = scanner.nextInt();
            System.out.println();


            if (Choice == 1) {
                System.out.println("$$$$$ Bank Of The Wealthy Information $$$$$");
                System.out.println("===========================================\n");
                System.out.println("Total Bank Balance is $" + (df.format((Check.get(0).BankBalance))));
                System.out.println("Total Bank Customers: " + Check.get(0).NumberOfCustomers +"\n");
                System.out.println("===========================================\n");
            }
            if (Choice == 2) {
                System.out.println("============================================");
                System.out.println("Checking Accounts");
                System.out.println("Rec   Name       Balance    Transactions");
                System.out.println("--------------------------------------------");
                for (int i = 0; i < Check.size(); i++) {
                    System.out.println(i + " " + Check.get(i).LastName + "\t" +
                            Check.get(i).FirstName + "\t$" + (df.format((Check.get(i).getCheckingBalance())))
                            + Check.get(i).Transactions + "\n");
                }
            }
            if (Choice == 3) {
                System.out.print("Enter Checking Record Number: ");
                int num = scanner.nextInt();
                System.out.print("Enter Amount Of Deposit: $");
                double newDeposit = scanner.nextDouble();

                Check.get(num).makeDeposit(newDeposit);
                System.out.println("============================================");
                System.out.println(Check.get(num).FirstName + " now has $"
                        + (df.format((Check.get(num).getCheckingBalance()))) + "\n");
                System.out.println("============================================");


            }
            if (Choice ==4 ) {
                System.out.print("Enter Checking Record Number: ");
                int num = scanner.nextInt();
                System.out.print("Enter Amount Of Withdraw: $");
                double newWithdraw = scanner.nextDouble();

                Check.get(num).makeWithdraw(newWithdraw);
                System.out.println("============================================");
                System.out.println(Check.get(num).FirstName + " now has $"
                        + (df.format((Check.get(num).getCheckingBalance()))) + "\n");
                System.out.println("============================================");

            }
            if (Choice == 5) {
                System.out.println("======================================");
                System.out.println("Loan Accounts");
                System.out.println("Rec   Name           Balance");
                System.out.println("--------------------------------------");
                for (int i = 0; i < Loan.size(); i++) {
                    System.out.println(i + " " + Loan.get(i).LastName + "\t" +
                            Loan.get(i).FirstName + "\t$" + (df.format((Loan.get(i).getLoanBalance()))) + "\n");
                }
                System.out.println("======================================\n");
            }
            if (Choice == 6) {
                System.out.print("Enter Loan Record Number: ");
                int num = scanner.nextInt();
                System.out.print("Enter Amount Of Loan You Would Like To Take: $");
                double newLoan = scanner.nextDouble();

                Loan.get(num).takeLoan(newLoan);
                System.out.println("============================================\n");
                System.out.println(Loan.get(num).FirstName + " now has $"
                        + (df.format((Loan.get(num).getLoanBalance()))) + " in the loan account.\n");
                System.out.println("============================================");
            }
            if (Choice == 7) {
                System.out.print("Enter Loan Record Number: ");
                int num = scanner.nextInt();
                System.out.print("Enter Amount Of Payment: $");
                double payAmt = scanner.nextDouble();

                Loan.get(num).makePayment(payAmt);
                System.out.println("============================================\n");
                System.out.println(Loan.get(num).FirstName + " now has $"
                        + (df.format((Loan.get(num).getLoanBalance()))) + " in the loan account.\n");
                System.out.println("============================================\n");

            }
            if (Choice >= 9) {
                System.out.println("Please Select A Choice 1-8\n");
            }
        }

    }
}


