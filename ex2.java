// Name:Vedaant Ambolkar
// Roll no:5
// Exp no:02



import java.util.Scanner;

class Ex2 {

    static long factorial(int a) {
        if (a <= 1) return 1;
        return a * factorial(a - 1);
    }

    static void armstrong(int number) {
        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }

    public static boolean isArmstrong(int number) {
        int originalNumber = number;
        int sum = 0;
        int numberOfDigits = String.valueOf(number).length();

        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, numberOfDigits);
            number /= 10;
        }

        return sum == originalNumber;
    }

    static void palindrome(int number) {
        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }
    }

    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reversedNumber = 0;

        while (number > 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        return originalNumber == reversedNumber;
    }

    static void prime(int number) {
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }

    public static boolean isPrime(int number) {
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

    static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int option;

        while (true) {
            System.out.println("*MAIN MENU");
            System.out.println("1. FACTORIAL");
            System.out.println("2. ARMSTRONG");
            System.out.println("3. PALINDROME");
            System.out.println("4. PRIME");
            System.out.println("5. FIBONACCI");
            System.out.println("6. END");
            System.out.println("ENTER YOUR OPTION");

            option = sc.nextInt();

            if (option == 6) {
                System.out.println("Exiting...");
                break;
            }

            System.out.print("Enter a number: ");
            int n = sc.nextInt();

            switch (option) {
                case 1:
                    long factorialResult = factorial(n);
                    System.out.println("Factorial of " + n + " is " + factorialResult);
                    break;
                case 2:
                    armstrong(n);
                    break;
                case 3:
                    palindrome(n);
                    break;
                case 4:
                    prime(n);
                    break;
                case 5:
                    int fibonacciResult = fibonacci(n);
                    System.out.println("Fibonacci number at position " + n + " is " + fibonacciResult);
                    break;
                default:
                    System.out.println("Enter a valid option.");
            }
        }

        sc.close();
    }
}
