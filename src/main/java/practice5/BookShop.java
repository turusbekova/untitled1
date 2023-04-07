package practice5;

import java.util.Scanner;

public class BookShop {

    public static void main(String[] args) {
        /**
         * Online Book Merchant offers premium customers 1 free book with every purchase of 5 or more books
         * and offers 2 free books with every purchase of 8 or more books.
         * It offers regular customers 1 free book with every purchase of 7 or more books
         * and offers 2 free books with every purchase of 12 or more books.
         *
         * Write a program to calculate number of free books.
         *
         *  sample output:
         * Are you a premium customer?
         * true
         * How many books for purchase?
         * 9
         * You qualify for 2 free books
         *
         */

        int freeBooks, numberOfBooksPurchased;
        boolean isPremiumCustomer;
        Scanner scanner = new Scanner(System.in);
        //TODO write your code here
        System.out.println("Are you a premium customer?");
        isPremiumCustomer = scanner.nextBoolean();
        System.out.println("How many books for purchase?");
        numberOfBooksPurchased = scanner.nextInt();
        countFreeBooks(isPremiumCustomer,numberOfBooksPurchased);




    }

    public static void  countFreeBooks(boolean isPremiumCustomer, int numberOfBooks) {
        //TODO implement method
        if (isPremiumCustomer && numberOfBooks >= 5 && numberOfBooks < 8){
            System.out.println("You qualify for 1 free book");
        }
        else if (isPremiumCustomer && numberOfBooks >= 8){
            System.out.println("You qualify for 2 free books");
        }
        else {
            if (!isPremiumCustomer && numberOfBooks >= 7 && numberOfBooks < 12){
                System.out.println("You qualify for 1 free book");
            }
            else if (!isPremiumCustomer && numberOfBooks >= 12){
                System.out.println("You qualify for 2 free books");
            }
        }
    }
}
