package com.company;
import java.util.Scanner;

public class Menu {
    static Scanner sc = new Scanner(System.in);
    private static int pick;

    public static void menu() {
        while(true){
            System.out.println("Welcome to your online banking system. What would you like to do?");
            System.out.println("0. Exit \n1. Info menu \n2. Transfer \n3. Transfers history \n4. Transfer to your own account \n5. Change your password \n6. Change your PIN \n7. Change your limits");
            pick = sc.nextInt();
            switch (pick) {
                case 0:
                    System.exit(0);
                case 1:
                    infoMenu();
                case 2:
                    Transfer.transfer();
                    break;
                case 3:
                    System.out.println("Transfer history to fill");
                    break;
                case 4:
                    System.out.println("Transfer to your acc to fill");
                    break;
                case 5:
                    System.out.println("Change password to fill");
                    break;
                case 6:
                    System.out.println("Change PIN");
                    break;
                case 7:
                    System.out.println("Change limits");
                    break;
            }
        }
    }

    public static void infoMenu() {
        System.out.println("1. Account balance \n2. Account number \n3. User number");

        while(true){
        pick = sc.nextInt();
        switch (pick) {
            case 1:
                System.out.println(UserAccount.getAccountBalance());
                break;
            case 2:
                System.out.println(UserAccount.getAccountNumber());
                break;
            case 3:
                System.out.println(UserAccount.getUserID());
                break;
            case 0:
                System.exit(0);
        }

        }

    }
}
