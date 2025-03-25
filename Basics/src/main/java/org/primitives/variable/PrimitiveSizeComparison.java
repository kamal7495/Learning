package org.primitives.variable;

/**
 * Write a program that compares the memory size of each primitive data type (in bytes) and prints the result
 */
public class PrimitiveSizeComparison {
    public static void main(String[] args) {
        System.out.println("Memory size of primitive data types in Java (in bytes):");
        System.out.println("byte: " + Byte.BYTES + " bytes");
        System.out.println("short: " + Short.BYTES + " bytes");
        System.out.println("int: " + Integer.BYTES + " bytes");
        System.out.println("long: " + Long.BYTES + " bytes");
        System.out.println("float: " + Float.BYTES + " bytes");
        System.out.println("double: " + Double.BYTES + " bytes");
        System.out.println("char: " + Character.BYTES + " bytes");
        System.out.println("boolean: (size depends on JVM implementation, not fixed)");
    }
}

