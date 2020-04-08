package com.macarios.lesson17;

import com.macarios.exercises.Exercise;

public class Exercise06 implements Exercise {
    @Override
    public String execute() {
        for (int i=1; i<=20; i++){
            System.out.print(i + " | ");
        }
        return "";
    }
}
