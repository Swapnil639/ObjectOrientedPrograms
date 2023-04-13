package com.bridgelabz;


import java.util.Scanner;

class AccountBalance {
    private double accountBalance = 5000;

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }
}

public class Account extends AccountBalance {
    public static void main(String[] args) {
        Account account = new Account();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter debit Amount");
        double debitAmount = scanner.nextInt();
        account.debit(debitAmount);
    }

    public void debit(double debitAmount) {

        if (getAccountBalance() >= debitAmount) {
            double remainingAmount = getAccountBalance() - debitAmount;
            setAccountBalance(remainingAmount);
            System.out.println("Remaining  balance is :" + getAccountBalance());
        } else {
            System.out.println("Debit amount exceed account balance");
        }
    }
}