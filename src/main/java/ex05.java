/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 James Moore
 */

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class ex05 {
    public static void main(String[] args){
        Scanner inScan = new Scanner(System.in);

        System.out.print("What is the first number? ");
        String first = inScan.nextLine();
        System.out.print("What is the second number? ");
        String second = inScan.nextLine();
        int num1 = parseInt(first);
        int num2 = parseInt(second);
        // could use for loop with conditionals
        System.out.printf(
                "%d + %d = %d\n" +
                "%d - %d = %d\n" +
                "%d * %d = %d\n" +
                "%d / %d = %d\n",
                num1, num2, num1 + num2,
                num1, num2, num1 - num2,
                num1, num2, num1 * num2,
                num1, num2, num1 / num2);
    }
}
