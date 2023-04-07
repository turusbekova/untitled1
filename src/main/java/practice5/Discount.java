package practice5;

import java.util.Scanner;

public class Discount {

    public static void main(String[] args) {


        /**
         * Write a java program to calculate discount for a product
         *
         *  sample output:
         * Marked price:
         * 100
         * Discount rate:
         * 25
         * Amount after discount: 75.0
         */

        double markedPrice, discount, amount;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Marked price: ");
        markedPrice = scanner.nextDouble();
        System.out.println("Discount rate:");
        discount = scanner.nextDouble();
        String message = "";

        System.out.println("Amount after discount: " + calculateDiscount(markedPrice,discount));

        //TODO WRITE YOUR CODE HERE


    }

    public static double calculateDiscount(double markedPrice, double discount) {
        //TODO IMPLEMENT METHOD

        return markedPrice - discount;
    }

    public static void printMessage(String message) {
        //TODO IMPLEMENT METHOD
        System.out.println("Amount after discount: ");
    }
}
