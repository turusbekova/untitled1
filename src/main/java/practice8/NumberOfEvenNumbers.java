package practice8;

import java.util.Scanner;

public class NumberOfEvenNumbers {
    public static void main(String[] args) {
        /**
         * Write a program that calculates a number of an even numbers in an array
         *
         * ex:
         * Enter numbers:
         * 1
         * 2
         * 3
         * 4
         * 5
         * 6
         * Number of even numbers are: 3
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers:");
        int[] numbers = {scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt()};
        System.out.println("Number of even numbers are: " + calculate(numbers));


        //TODO WRITE YOUR CODE HERE

    }

    public static int calculate(int[] numbers) {
        //TODO IMPLEMENT METHOD
        int count = 0;
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] % 2 == 0){
                count++;
            }
        }

        return count;
    }
}
