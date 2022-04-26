package com.company;

public class UserAccount {
    private final static int userID = 0;
    private static double accountBalance = 1000;
    private final static String accountNumber = "68 5928 1245 5256 2750 2356 1255";

    public static String getPIN() {
        return PIN;
    }

    private static String PIN = "1234";

    public static String getAccountNumber() {
        return accountNumber;
    }

    public static int getUserID() {
        return userID;
    }

    public static double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

}
