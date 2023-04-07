package practice4;

import java.util.Scanner;

public class JoilesRestaurant2 {
    public static void main(String[] args) {

        int numberOfGuests;
        double billAmount;
        double taxFee = 0;
        boolean isSplit;
        String serviceQuality;
        double totalAmount = 0;
//        double totalAmountPerGuest = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Jolie's Restaurant!!!\n Enter number of guests:");
        numberOfGuests = scan.nextInt();
        System.out.println("Enter a restaurant bill amount:");
        billAmount = scan.nextDouble();
        System.out.println("Is your check split?");
        isSplit = scan.nextBoolean();
        System.out.println("How was the restaurant's service? (bad, ok, good or perfect)");
        serviceQuality = scan.next();
        if (serviceQuality.equalsIgnoreCase("bad") && isSplit){
            double check = billAmount * 0.1 + billAmount;
            System.out.println(check + " - your bill amount");

            double totalAmountPerGuest = check / numberOfGuests;
           System.out.println("Total amount Per Guest: " + totalAmountPerGuest);
        }
        else {
            if (serviceQuality.equalsIgnoreCase("ok")){
                double check1 = billAmount * 0.15 + billAmount;
                System.out.println(check1 + " - your bill amount");

                double total = check1 / numberOfGuests;
                System.out.println("Total amount Per Guest: " + total);
            }
            else if (serviceQuality.equalsIgnoreCase("good")){
                double check2 = billAmount * 0.2 + billAmount;
                System.out.println(check2 + " - your bill amount");

                double total1 = check2 / numberOfGuests;
                System.out.println("Total amount Per Guest: " + total1);
            }
            else if (serviceQuality.equalsIgnoreCase("perfect")){
                double check3 = billAmount * 0.25 + billAmount;
                System.out.println(check3 + " - your bill amount");

                double total2 = check3 / numberOfGuests;
                System.out.println("Total amount Per Guest: " + total2);
            }
            else {
                System.out.println(billAmount + " your total amount");
            }
        }


    }
}
