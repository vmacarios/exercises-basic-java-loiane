package com.macarios.lesson17;

import com.macarios.exercises.Exercise;

import java.util.Scanner;

public class Exercise07 implements Exercise {
    @Override
    public String execute() {
        Scanner scanner = new Scanner(System.in);
        double num;
        double max = Integer.MIN_VALUE;
        System.out.print("Insert 5 numbers: ");
        for (int i = 0; i < 5; i++) {
            while (!scanner.hasNextDouble()) {
                scanner.next();
            }
            num = scanner.nextDouble();
            if (num > max) {
                max = num;
            }
        }

        return "The highest number is: " + max;
    }
}
