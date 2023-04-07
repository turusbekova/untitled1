package practice6;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        /**
         * In main the factorial of a positive integer n, denoted by n! is the product
         * of all integers less than equal to n
         * Calculate factorial and output result to the console
         * ex: 5! = 5 * 4 * 3 * 2 * 1
         * Enter a number: 5
         * Factorial result: 120
          */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:");
        long num = scan.nextLong();
        calculate(num);

    }

    public static void calculate(long num ){
        long multi = 1;
        for (long i = 1; i <= num; i++){
            multi = multi * i;
        }
        System.out.println("Factorial result: " + multi);
    }

}
