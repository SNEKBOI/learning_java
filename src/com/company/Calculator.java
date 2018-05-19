package com.company;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type the first number: ");
        int a = Integer.parseInt(reader.nextLine());

        System.out.print("Type the second number: ");
        int b = Integer.parseInt(reader.nextLine());

        System.out.println("A = " + a + "\nB = " + b);

        int addition = a + b;
        int substraction = a - b;
        int multiplication = a * b;
        double division = (double)a / b;

        System.out.println("Addition: " + addition);
        System.out.println("Substraction: " + substraction);
        System.out.println("Multiplication: " + multiplication);
        System.out.println("Division: " + division);
    }
}
