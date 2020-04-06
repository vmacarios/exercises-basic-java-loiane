package com.macarios.exercises;

import com.macarios.lesson17.Exercise01;
import com.macarios.lesson17.Exercise02;

public class Exercises
{
    public static void main( String[] args )
    {
        execute(new Exercise02());
    }

    public static void execute(final Exercise exercise) {
        System.out.println(exercise.execute());
    }
}
