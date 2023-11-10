package main.practice;

public class Recursion{

    public static void main(String[] args) {
        // 1: Factorial
        int factorialResult = factorial(5);
        System.out.println("Factorial of 5 is: " + factorialResult);

        // 2: Sum of Natural Numbers
        int sumResult = sumOfNaturalNumbers(5);
        System.out.println("Sum of first 5 natural numbers is: " + sumResult);

        // 3: Power Function
        int powerResult = power(2, 3);
        System.out.println("2 raised to the power of 3 is: " + powerResult);

        // 4: Binary Search
        int[] sortedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int searchKey = 6;
        int searchIndex = binarySearch(sortedArray, searchKey, 0, sortedArray.length - 1);
        System.out.println("Index of " + searchKey + " in the sorted array is: " + searchIndex);

        // 5: Fibonacci Sequence
        int fibonacciResult = fibonacci(6);
        System.out.println("Fibonacci sequence at position 6 is: " + fibonacciResult);
    }

    // 1: Factorial
    public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    // 2: Sum of Natural Numbers
    public static int sumOfNaturalNumbers(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + sumOfNaturalNumbers(n - 1);
        }
    }

    // 3: Power Function
    public static int power(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else {
            return base * power(base, exponent - 1);
        }
    }

    // 4: Binary Search
    public static int binarySearch(int[] array, int value, int start, int end) {
        if (start <= end) {
            int mid = start + (end - start) / 2;

            if (array[mid] == value) {
                return mid;
            } else if (array[mid] < value) {
                return binarySearch(array, value, mid + 1, end);
            } else {
                return binarySearch(array, value, start, mid - 1);
            }
        }
        return -1; // value not found
    }

    // 5: Fibonacci Sequence
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}

