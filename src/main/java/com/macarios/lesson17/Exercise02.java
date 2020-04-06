package com.macarios.lesson17;

import com.macarios.exercises.Exercise;

import java.util.Scanner;

public class Exercise02 implements Exercise {
    @Override
    public String execute() {
        String username;
        String password;
        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Insert a username: ");
            username = scan.next();
            System.out.print("Insert a password: ");
            password = scan.next();
            if (!username.equalsIgnoreCase(password)) {
                break;
            }
            System.out.println("The password can't be the same as the username");
        }
        return "Successful";
    }
}
