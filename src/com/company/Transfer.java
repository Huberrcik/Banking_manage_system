package com.company;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.lang.Object;

public class Transfer {
    static Scanner sc = new Scanner(System.in);
    private static String transferGetter;
    private static String getterAccountNumber;
    private static String transferTittle;
    private static double transferAmount;
    private static char confirm;

    static void transfer() {
        System.out.println("Getter name:");
        transferGetter = sc.nextLine();

        System.out.println("Getter account number:");
        getterAccountNumber = sc.nextLine();

        System.out.println("Transfer tittle:");
        transferTittle = sc.nextLine();

        System.out.println("Transfer amount:");
        transferAmount = sc.nextDouble();

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        //System.out.println(dtf.format(now));

        System.out.println("Sum:");
        System.out.println("Getter name: " + transferGetter);
        System.out.println("Getter account number: " + getterAccountNumber);
        System.out.println("Transfer tittle: " + transferTittle);
        System.out.println("Transfer amount: " + transferAmount);
        System.out.println("Date of transfer: " + dtf.format(now));
        System.out.println("Confirm it (y/n):");
        confirm = sc.next().charAt(0);

        if (confirm == 'y') {
            System.out.println("Transaction confirmed, write your PIN please");
            String PIN = sc.nextLine();
            if (PIN.equals(UserAccount.getPIN())) {
                System.out.println("Transaction complited");
            } else {
                int i = 0;
                while (i < 3) {
                    System.out.println("Wrong PIN, try again: ");
                    PIN = sc.nextLine();
                    if (PIN.equals(UserAccount.getPIN())) {
                        System.out.println("Transaction complited");
                        break;
                    }
                    i++;
                }
                System.out.println("Your account has been blocked, change your PIN please");
            }

        }
    }
}
