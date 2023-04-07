package practice4;

import java.util.Scanner;

public class CoachingWithLoveDaycare {
    public static void main(String[] args) {
        /**
         *
         * Write a java program for Coaching with Love Daycare.
         * Follow acceptance criteria:
         * age should be older than 1.5 but younger than 6 (inclusively)
         * if age is less than 3 years -> class name is Star and fee is 2000
         * if age is less than 6 years -> class name is Sun and fee is 1500
         * if they agree with the price -> print child is accepted.
         * otherwise child should not have a class and print he/she is not accepted.
         *
         *
         *
         * 1)example output - positive:
         * Enter child's name
         * Elsa
         * Enter age:
         * 2
         * Daycare fee is 2000
         * Would you like to apply?
         * true
         * Congratulations! Elsa is accepted!
         * Elsa's class is Star
         *
         * 2)example output - negative:
         * Enter child's name
         * Anna
         * Enter age:
         * 3
         * Daycare fee is 1500
         * Would you like to apply?
         * false
         * Anna is not accepted.
         *
         * 3)example output - negative:
         * Enter child's name
         * Christoph
         * Enter age:
         * 1
         * Christoph is not accepted.
         *
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter child's name:");
        String name = scan.nextLine();
        System.out.println("Enter age:");
        double age = scan.nextInt();


        if (age > 1.5 && age <= 6 ){
           if (age <= 3){
               System.out.println("class name is Star\n fee is 2000");
           }
           else if (age < 6){
               System.out.println("class name is Sun\n fee is 1500");
           }
           else {
               System.out.println(name + " is not accepted");
           }
        }
         if (age > 1.5 && age <= 6){
            System.out.println("Would you like to apply?");
            boolean answer = scan.nextBoolean();
            if (answer == true){
                System.out.println("Congratulation! Your child is accepted");
            }
            else {
                System.out.println(name + " is not accepted");
            }
        }
         else {
             System.out.println(name + " is not accepted");
         }

    }
}
