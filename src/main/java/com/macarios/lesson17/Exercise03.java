package com.macarios.lesson17;

import com.macarios.exercises.Exercise;

import java.util.Scanner;

public class Exercise03 implements Exercise {
    @Override
    public String execute() {
        String name;
        int age;
        double salary;
        String sex;
        String maritalStatus;
        boolean valid = false;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.print("Insert your name: ");
            name = scan.next();
            if (name.length() > 3) {
                valid = true;
            }
        } while (!valid);

        valid = false;
        do {
            System.out.print("Insert your age: ");
            age = scan.nextInt();
            if (age > 0 && age < 150) {
                valid = true;
            }
        } while (!valid);

        valid = false;
        do {
            System.out.print("Insert your salary: ");
            salary = scan.nextDouble();
            if (salary > 0) {
                valid = true;
            }
        } while (!valid);

        valid = false;
        do {
            System.out.print("Insert your sex: ");
            sex = scan.next();
            if (sex.equalsIgnoreCase("m") || sex.equalsIgnoreCase("f")) {
                valid = true;
            }
        } while (!valid);

        do {
            System.out.print("Insert your marital status: ");
            maritalStatus = scan.next();
            switch (maritalStatus) {
                case "s" :
                case "S" :
                case "m" :
                case "M" :
                case "w" :
                case "W" :
                case "d" :
                case "D" : valid = true ; break;
                default: valid = false;
            }
        } while (!valid);

        return "Name: " + name +
                "\nAge: " + age +
                "\nSalary: " + salary +
                "\nSex: " + sex +
                "\nMarital Status: " + maritalStatus;
    }
}
