package practice2;

import java.util.Scanner;

public class ThirdTask {
    public static void main(String[] args) {
        //            System.out.println("***********************************");
//            System.out.println("TASK #3");
//            /**
//             *
//             *  Write a program that calculates a multiplication by 9 WITHOUT multiplying
//             *  Tasks:
//             *  1) have a number input
//             *  2) add 0 to the end of the number and save it
//             *  3) subtract original number from the saved number
//             *  4) print out the result
//             *
//             *  Example output:
//             *   Enter any number I will calculate a multiplication by 9 without multiplying:
//             *   754
//             *   The result is 6786
//             *
//             */
//
//            //TODO implement your code here...
//
//            int number = 0;
//            int numberWith0 = 0;
//            int myResult = 0;
//            System.out.println(number + " * 9 = " + myResult);
//            Validation.testMultiplicationBy9(number, myResult);


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num = scan.nextInt();
        int number0 = 10;
        int numWith0 = number0 * num;
        int myResult = numWith0 - num;
        System.out.println(num + " * 9 = " + myResult);
        System.out.println("our data: " + num + ", " + myResult);






    }
}
