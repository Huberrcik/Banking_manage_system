package com.company;

import java.util.Scanner;

public class Register {
    Register(){
        nickReading();
    }
    String nickReading(){
        String nick;
        String nick2;
        String password;
        Scanner sc = new Scanner(System.in);
        System.out.println("Type your nickname:");
        nick = sc.nextLine();
        while(nick.length() > 15 || nick.length() < 3){
            System.out.println("Your nick must have between 3 and 15 signs, try again: ");
            nick = sc.nextLine();
        }
        return nick;
    }
}
