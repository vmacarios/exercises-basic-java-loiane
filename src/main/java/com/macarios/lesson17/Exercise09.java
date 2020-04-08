package com.macarios.lesson17;

import com.macarios.exercises.Exercise;

public class Exercise09 implements Exercise {
    @Override
    public String execute() {
        for (int i = 1; i <= 50; i++)
            if (i % 2 != 0) {
                System.out.println(i);
            }
        return "";
    }
}
