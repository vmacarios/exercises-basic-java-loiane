package com.macarios.exercises;

import com.macarios.lesson17.Exercise01;
import com.macarios.lesson17.Exercise02;
import com.macarios.lesson17.Exercise03;
import com.macarios.lesson17.Exercise04;

public class Exercises
{
    public static void main( String[] args )
    {
        execute(new Exercise04());
    }

    public static void execute(final Exercise exercise) {
        System.out.println(exercise.execute());
    }
}
