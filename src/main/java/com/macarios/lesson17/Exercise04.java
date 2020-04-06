package com.macarios.lesson17;

import com.macarios.exercises.Exercise;

public class Exercise04 implements Exercise {
    @Override
    public String execute() {
        double A = 80000;
        double rateA = 1.03;
        double B = 200000;
        double rateB = 1.015;
        int years = 0;
        while (A <= B) {
            A = A * rateA;
            B = B * rateB;
            years++;
        }
        return "To A surpass B it will take " + years + " years" +
                "\nThe new population of A will be: " + A +
                "\nThe new population of B will be: " + B;
    }
}
