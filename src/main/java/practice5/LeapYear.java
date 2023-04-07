package practice5;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        /**
         * Write a java program to find out if the given year is leap or not
         *
         *  sample output:
         * Enter any calendar year : 2000
         * 2000 is a leap year
         */

        int year;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any calendar year:");
        year = scanner.nextInt();
        leapOrNot(year);
        //TODO write your code here

    }

    public static void leapOrNot(int year) {
        //TODO IMPLEMENT METHOD
        if (year % 4 == 0){
            System.out.println(year + " is a leap year");
        }
        else {
            System.out.println(year + " isn't a leap year");
        }

    }
}
