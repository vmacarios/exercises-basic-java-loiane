package com.macarios.exercises;

import com.macarios.lesson17.*;

public class Exercises
{
    public static void main( String[] args )
    {
        execute(new Exercise05());
    }

    public static void execute(final Exercise exercise) {
        System.out.println(exercise.execute());
    }
}
