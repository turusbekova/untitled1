package practice6;

import java.util.Scanner;

public class LeapYearCount {
    public static void main(String[] args) {

        /**
         * We have a customer who was born on a leap date (04.28.1950). In 2010 she turned 60,
         * but officially she is 15 years old, since there were only 15 leap years between 1950 and 2010.
         *
         * Write a program that takes two years and counts the number of leap years between two years
         *
         * Example output:
         * Enter first year: 1950
         * Enter second year: 2010
         *
         * Number of leap years: 15
         *
         */

        Scanner sc = new Scanner(System.in);

        int startYear;
        int endDate;

        // TODO WRITE YOUR CODE HERE
        System.out.println("Enter a first year: ");
        startYear = sc.nextInt();
        System.out.println("Enter a second year: ");
        endDate = sc.nextInt();
        System.out.println("The number of leap years: " + countLeapYearsBetweenYears(startYear, endDate));

    }

    public static int countLeapYearsBetweenYears(int startYear, int endYear) {
        // TODO IMPLEMENT METHOD
        int sum =0;
       for (int i = startYear; i <= endYear; i++ ){
           if (i % 4 == 0){
               sum++;
           }
          startYear++;
       }
        return sum;
    }
}
