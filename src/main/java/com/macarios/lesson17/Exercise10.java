package com.macarios.lesson17;

import com.macarios.exercises.Exercise;

import java.util.Scanner;

public class Exercise10 implements Exercise {
    @Override
    public String execute() {
        Scanner scan = new Scanner(System.in);
        int start;
        int end;
        System.out.print("Insert 2 numbers: ");
        while (!scan.hasNextInt()) {
            scan.next();
        }
        start = scan.nextInt();
        while (!scan.hasNextInt()) {
            scan.next();
        }
        end = scan.nextInt();

        if (start > end) {
            start = start + end;
            end = start - end;
            start = start - end;
        }

        for (int i = start + 1; i < end; i++) {
            System.out.println(i);
        }

        return "";
    }
}
