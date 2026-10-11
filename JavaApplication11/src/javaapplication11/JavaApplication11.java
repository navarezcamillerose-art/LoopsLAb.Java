/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication11;
import java.util.Scanner;

/**
 *
 * @author THIS
 */
public class JavaApplication11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
 int choice;

        do {
            System.out.println("\n===== LOOP ACTIVITIES =====");
            System.out.println("1. Multiplication Table (for)");
            System.out.println("2. Sum of Natural Numbers (while)");
            System.out.println("3. Factorial (do-while)");
            System.out.println("4. Even and Odd Numbers (for)");
            System.out.println("5. Reverse Digits (while)");
            System.out.println("0. Exit");
            System.out.print("Choose: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    multiplicationTable();
                    break;
                case 2:
                    sumNatural();
                    break;
                case 3:
                    factorial();
                    break;
                case 4:
                    evenOdd();
                    break;
                case 5:
                    reverseDigits();
                    break;
                case 0:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 0);

        sc.close();
    }

    // Activity 1: for loop
    static void multiplicationTable() {
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }

    // Activity 2: while loop
    static void sumNatural() {
        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();

        if (n < 1) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        int i = 1;
        int sum = 0;

        while (i <= n) {
            sum += i;
            i++;
        }

        System.out.println("Sum = " + sum);
    }

    // Activity 3: do-while loop
    static void factorial() {
        System.out.print("Enter a non-negative integer: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Factorial is not defined for negative integers.");
            return;
        }

        long fact = 1;
        int i = 1;

        do {
            fact *= i;
            i++;
        } while (i <= n);

        System.out.println("Factorial = " + fact);
    }

    // Activity 4: for loop
    static void evenOdd() {
        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();

        if (n < 1) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        System.out.print("Even numbers: ");
        for (int i = 2; i <= n; i += 2) {
            System.out.print(i + " ");
        }

        System.out.print("\nOdd numbers: ");
        for (int i = 1; i <= n; i += 2) {
            System.out.print(i + " ");
        }

        System.out.println();
    }

    // Activity 5: while loop
    static void reverseDigits() {
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        int temp = Math.abs(num);
        long reversed = 0;

        while (temp != 0) {
            reversed = reversed * 10 + temp % 10;
            temp /= 10;
        }

        if (num < 0) {
            reversed = -reversed;
        }

        System.out.println("Reversed: " + reversed);
    }
}