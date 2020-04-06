package com.macarios.lesson17;

import com.macarios.exercises.Exercise;

import java.util.Scanner;

public class Exercise05 implements Exercise {
    @Override
    public String execute() {
        Scanner scanner;
        double A = 0;
        double rateA = 0;
        double B = 0;
        double rateB = 0;
        int years = 0;
        boolean invalid = true;
        do {
            System.out.print("Insert the country A population: ");
            scanner = new Scanner(System.in);
            if (scanner.hasNextDouble()) {
                A = scanner.nextDouble();
                if (A > 0) invalid = false;
                else System.out.println("Invalid value");
            } else System.out.println("Invalid value");
        } while (invalid);

        do {
            invalid = true;
            scanner = new Scanner(System.in);
            System.out.print("Insert the country A growth rate (%): ");
            if (scanner.hasNextDouble()) {
                rateA = scanner.nextDouble();
                if (rateA > 0 && rateA <=100) {
                    rateA = (1 + (rateA / 100));
                    invalid = false;
                } else {
                    System.out.println("Invalid value");
                }
            } else {
                System.out.println("Invalid value");
            }
        } while (invalid);

        do {
            invalid = true;
            scanner = new Scanner(System.in);
            System.out.print("Insert the country B population: ");
            if (scanner.hasNextDouble()) {
                B = scanner.nextDouble();
                if (B > 0) invalid = false;
                else {
                    System.out.println("Invalid value");
                }
            } else {
                System.out.println("Invalid value");
            }
        } while (invalid);

        do {
            invalid = true;
            scanner = new Scanner(System.in);
            System.out.print("Insert the country B growth rate (%): ");
            if (scanner.hasNextDouble()) {
                rateB = scanner.nextDouble();
                if (rateB > 0 && rateB <=100) {
                    rateB = (1 + (rateB/100));
                    invalid = false;
                } else {
                    System.out.println("Invalid value");
                }
            } else {
                System.out.println("Invalid value");
            }
        } while (invalid);

        while (A <= B) {
            A *= rateA;
            B *= rateB;
            years++;
        }
        scanner.close();
        return "To A surpass B it will take " + years + " years" +
                "\nThe new population of A will be: " + A +
                "\nThe new population of B will be: " + B;
    }
}