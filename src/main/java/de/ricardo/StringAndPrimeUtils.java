package de.ricardo;

public class StringAndPrimeUtils {

    // Method to reverse a given string
    public static String reverseString(String input) {
        if (input == null) {
            return null;
        }
        StringBuilder reversed = new StringBuilder(input);
        return reversed.reverse().toString();
    }

    // Method to check if a given string is a palindrome
    public static boolean isPalindrome(String input) {
        if (input == null) {
            return false;
        }
        String reversed = reverseString(input);
        return input.equals(reversed);
    }

    // Method to generate the first n prime numbers
    public static int[] generatePrimes(int n) {
        if (n <= 0) {
            return new int[0];
        }
        int[] primes = new int[n];
        int count = 0;
        int number = 2;
        while (count < n) {
            if (isPrime(number)) {
                primes[count] = number;
                count++;
            }
            number++;
        }
        return primes;
    }

    // Helper method to check if a number is prime
    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Main method for testing
    public static void main(String[] args) {
        // Testing reverseString method
        String str = "Hello";
        System.out.println("Reversed: " + reverseString(str));

        // Testing isPalindrome method
        String palindrome = "anna";
        System.out.println("Is palindrome: " + isPalindrome(palindrome));

        // Testing generatePrimes method
        int n = 10;
        int[] primes = generatePrimes(n);
        System.out.print("First " + n + " prime numbers: ");
        for (int prime : primes) {
            System.out.print(prime + " ");
        }
    }
}

