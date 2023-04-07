package practice2;

import java.util.Scanner;

public class FifthTask {
    public static void main(String[] args) {
        //            System.out.println("TASK #5");
//            /*
//             * Write a program that takes number of minutes from user and converts the number to Years and Days
//             *
//             * Tasks:
//             * 1) have a number long
//             * 2) to get years, divide input number to the total number of minutes in year
//             * 3) to get days, divide input number to the total minutes in one day, then modulus by total number of days in a year
//             *
//             *
//             *
//             * Example output:
//             *  Input the number of minutes:
//             *  3456789
//             *  3456789 minutes is approximately 6 years and 210 days
//             *
//             */
//
//            //TODO implement your code here...
//            long totalMinInYear = 0;
//            long min = 0;
//            int years = 0;
//            int days = 0;
//
//
//
//            MemberSubmissionAddressing.Validation.testMinutes(min, years, days);
//            System.out.println("--- The end ---");
        Scanner input = new Scanner(System.in);

        long totalMinInYear = 0;

        System.out.println("Please enter the number of minutes:");
        long min = input.nextLong();
        int years = (int) (min/(60*24*365));
        //int days = (int) (min/(24*60))-years*365;
        int remainderminutes = (int) (min%(60*24*365));

        int days = remainderminutes/(60*24);
        //int days = (int) (min%(60*24*365)/(24*60));
        System.out.println(min+ " minutes is approximately "+ years+ "years and "+ days+ " days");



    }
}
