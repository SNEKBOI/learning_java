package com.company;

import java.util.Scanner;

public class LowerUpper {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Give me lower limit: ");
        int lower = Integer.parseInt(reader.nextLine());

        System.out.print("Give me upper limit: ");
        int upper = Integer.parseInt(reader.nextLine());

        for (int i = lower; i <= upper; i++) {
            System.out.println(i);
        }

        System.out.println("END");
    }
}
