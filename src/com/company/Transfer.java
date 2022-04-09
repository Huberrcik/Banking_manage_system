package com.company;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.lang.Object;

public class Transfer {
    Scanner sc = new Scanner(System.in);
    private String transferGetter;
    private String getterAccountNumber;
    private String transferTittle;
    private double transferAmount;
    private char confirm;
    void transfer(){
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

    }
}
