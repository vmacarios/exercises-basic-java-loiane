package com.macarios.lesson17;

import com.macarios.exercises.Exercise;

import java.util.Scanner;

public class Exercise07 implements Exercise {
    @Override
    public String execute() {
        Scanner scanner = new Scanner(System.in);
        double[] nums = new double[5];
        double max;
        System.out.print("Insert 5 numbers: ");
        for (int i = 0; i < 5; i++) {
            while (!scanner.hasNextDouble()) {
                scanner.next();
            }
            nums[i] = scanner.nextDouble();
        }
        max = nums[0];
        for (int i = 1; i < 5; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return "The highest number is: " + max;
    }
}
