package com.macarios.lesson17;

import com.macarios.exercises.Exercise;

import java.util.Scanner;

public class Exercise01 implements Exercise {
    @Override
    public String execute() {
        double grade;
        System.out.print("Insert a grade between 0 and 10: ");
        while (true) {
            Scanner scan = new Scanner(System.in);
            if (scan.hasNextDouble()) {
                grade = scan.nextDouble();
                if (grade >= 0 && grade <= 10) {
                    break;
                }
            }
            System.out.println("Invalid input");
            System.out.print("Insert a grade between 0 and 10: ");
        }
        return "Your grade is " + grade;

    }
}
