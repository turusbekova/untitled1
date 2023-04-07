package practice4;

import java.util.Scanner;

public class JoliesRestaurant {
    public static void main(String[] args) {
        /**
         *
         * Write a check to a customer based on their input
         * - how many people?
         * - what is the total amount?
         *      * automatically add 10% tax fee
         * - provide check together or split?
         *      * split - divide amount per person
         *      * together - one total amount for all
         * - how was the restaurant's service?
         *      * bad - 10%
         *      * ok - 15%
         *      * good - 20%
         *      * perfect - 25%
         *
         *
         * example output:
         * out: Welcome to Jolie's Restaurant!!!
         * out: Enter number of guests:
         *  in: 5
         * out: Enter a restaurant bill amount:
         *  in: 200
         * out: Is your check split?
         *  in: true
         * out: How was the restaurant's service? (Options: bad-10%, ok-15%, good-20%, perfect-25%)
         *  in: perfect
         * out: Number of guests: 5
         * out: Total amount: $275.0
         * out: Total per guest: $55.0
         */

        Scanner scan = new Scanner(System.in);
//        int numberOfGuests = 0;
//        double billAmount = 0;
//        double taxFee = 0;
//        boolean isSplit = false;
//        String serviceQuality = "";
//        ouble totalAmount = 0;
//        double totalAmountPerGuest = 0;

        //TODO write your code here


        // ignore this
       // Validation.testBill(numberOfGuests, billAmount, isSplit, serviceQuality, totalAmount, totalAmountPerGuest);
        System.out.println("Welcome to Jolie's Restaurant!!!\n Enter number of guests:");
        int guests = scan.nextInt();
        System.out.println("Enter a restaurant bill amount:");
        int billAmount = scan.nextInt();
        System.out.println("Is your check split?");
        boolean isSplit = scan.nextBoolean();

        String service;
        System.out.println("How was the restaurant's service?");
        service = scan.next();
        if (service.equalsIgnoreCase("bad")) {
            System.out.println("Your bill amount is " + billAmount / 100 * 10 + billAmount);
        } else if (service.equalsIgnoreCase("ok")) {
            System.out.println("Your bill amount is " + (billAmount / 100 * 15) + billAmount);
        } else if (service.equalsIgnoreCase("good")) {
            System.out.println("Your bill amount is " + (billAmount / 100 * 20) + billAmount);
        } else if (service.equalsIgnoreCase("perfect")) {
            System.out.println("Your bill amount is " + (billAmount / 100 * 25) + billAmount);
        }



 //       if (isSplit) {
//            System.out.println("How was the restaurant's service?");
//            service = scan.next();
//            if (service.equalsIgnoreCase("bad")) {
//                System.out.println("Your bill amount is " + (billAmount * 0.1));
//            } else if (service.equalsIgnoreCase("ok")) {
//                System.out.println("Your bill amount is " + (billAmount / 100 * 15) + billAmount);
//            } else if (service.equalsIgnoreCase("good")) {
//                System.out.println("Your bill amount is " + (billAmount / 100 * 20) + billAmount);
//            } else if (service.equalsIgnoreCase("perfect")) {
//                System.out.println("Your bill amount is " + (billAmount / 100 * 25) + billAmount);
//            }
//        }if (guests > 1 ){
//            System.out.println("Your total amount is " + billAmount);
//            System.out.println("Total per guest:" + billAmount / guests);
//        }
//        else {
//            System.out.println("Your total amount is " + billAmount);
//        }


        }

    }


