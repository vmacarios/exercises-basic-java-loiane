package com.macarios.lesson17;

import com.macarios.exercises.Exercise;

import java.util.Scanner;

public class Exercise08 implements Exercise {
    @Override
    public String execute() {
        Scanner scanner = new Scanner(System.in);
        double[] nums = new double[5];
        double sum = 0;
        double avg;
        System.out.print("Insert 5 numbers: ");
        for (int i = 0; i < 5; i++) {
            while (!scanner.hasNextDouble()) {
                scanner.next();
            }
            nums[i] = scanner.nextDouble();
        }
        for (int i = 0; i < 5; i++) {
            sum += nums[i];
        }
        avg = sum/5;
        return "The sum of the given numbers is: " + sum +
                "\nThe average of them is: " + avg;
    }
}
