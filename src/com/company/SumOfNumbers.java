package com.company;

import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int sum = 0;
        int number = 0;

        System.out.println();

        do {
            System.out.print("Give me a number: ");
            number = Integer.parseInt(reader.nextLine());
            sum += number;
        } while (number != 0);

        System.out.println("The sum is: " + sum);
    }
}
