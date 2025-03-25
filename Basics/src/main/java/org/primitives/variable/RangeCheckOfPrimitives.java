package org.primitives.variable;

import java.util.Scanner;

/**
 * Create a program that checks whether a given value fits into a specific primitive data type (e.g., `byte`, `int`, `short`). Print a message if the value exceeds the range.
 */
public class RangeCheckOfPrimitives {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String input = scanner.nextLine();

        try {
            long number = Long.parseLong(input);
            System.out.println(number + " can fit in:");

            if (number >= Byte.MIN_VALUE && number <= Byte.MAX_VALUE) {
                System.out.println("* byte");
            }
            if (number >= Short.MIN_VALUE && number <= Short.MAX_VALUE) {
                System.out.println("* short");
            }
            if (number >= Integer.MIN_VALUE && number <= Integer.MAX_VALUE) {
                System.out.println("* int");
            }
            if (number >= Long.MIN_VALUE && number <= Long.MAX_VALUE) {
                System.out.println("* long");
            }
        } catch (NumberFormatException e) {
            System.out.println("The number is too large to fit in any primitive data type.");
        }

        scanner.close();
    }
}
