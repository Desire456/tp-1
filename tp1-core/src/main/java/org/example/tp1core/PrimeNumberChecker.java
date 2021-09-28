package org.example.tp1core;

public class PrimeNumberChecker {
    private PrimeNumberChecker() {}

    public static boolean isPrime(int number) {
        if (number < 1) {
            return false;
        }
        if (number == 1) {
            return true;
        }

        for (int i = 2; i <= number / 2 ; i++) {
            if ((number % i) == 0) {
                return false;
            }
        }

        return true;
    }
}
