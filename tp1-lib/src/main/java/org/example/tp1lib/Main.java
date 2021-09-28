package org.example.tp1lib;

import org.example.tp1core.PrimeNumberChecker;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt(); scanner.nextLine();
            boolean isPrime = PrimeNumberChecker.isPrime(number);
            System.out.printf("Is the number %d prime? %s.%n", number, isPrime ? "Yes" : "No");
            System.out.print("Do you want to continue? (Y|N): ");
            exit = scanner.nextLine().equalsIgnoreCase("N");
        }
    }
}
