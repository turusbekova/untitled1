package practice2;

import java.util.Scanner;

public class FourthTask {
    public static void main(String[] args) {
        //            System.out.println("***********************************");
//            System.out.println("TASK #4");
//            /**
//             *
//             * 5 street performers are singing every day.
//             * At the end of the day they collect all money to one bucket and divide their profit equally.
//             * For more accuracy and time efficiency they need a program to get a daily profit.
//             * Help them out!
//             *
//             * 1) Have 5 inputs
//             * 2) Calculate profit for each person
//             * 3) Print out the result
//             *
//             * Output example:
//             *  Jake's: 100.25
//             *  Phil's: 88.50
//             *  Ryan's: 99.00
//             *  Tom's: 69.00
//             *  Bill's: 123.45
//             *  Each performer gets $96.04
//             */
//
//            //TODO implement your code here...
//
//            double jake = 0;
//            double phil = 0;
//            double ryan = 0;
//            double tom = 0;
//            double bill = 0;
//            double eachDailyProfit = 0;
//            MemberSubmissionAddressing.Validation.testProfit(jake, phil, ryan, tom, bill, eachDailyProfit);

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Jake profit: ");
        double jake = scan.nextInt();
        System.out.println("Enter Phil profit: ");
        double phil = scan.nextInt();
        System.out.println("Enter Ryan profit: ");
        double ryan = scan.nextInt();
        System.out.println("Enter Tom profit: ");
        double tom = scan.nextInt();
        System.out.println("Enter Bill profit: ");
        double bill = scan.nextInt();

        double eachDailyProfit = (jake + phil + ryan + tom + bill)/5;
        System.out.println("Each performer gets - " + eachDailyProfit);

    }
}
