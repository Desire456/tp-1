package org.example.tp1core;

public class PrimeNumberChecker {
    private PrimeNumberChecker() {}

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        double sqrtOfNumber = Math.sqrt(number);
        for (int i = 2; i <= sqrtOfNumber; i++) {
            if ((number % i) == 0) {
                return false;
            }
        }

        return true;
    }
}
