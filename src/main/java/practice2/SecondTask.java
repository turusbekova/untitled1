package practice2;

import java.util.Scanner;

public class SecondTask {

    public static void main(String[] args) {
        // System.out.println("===================================");
//            System.out.println("TASK #2");
//            /**
//             *
//             * Write a program, that calculates 10% bonus for a salary
//             * Tasks:
//             * 1) have a salary input to your system
//             * 2) calculate 10% of a salary
//             * 3) print out total amount of salary and bonus
//             *
//             * Example output:
//             *  Enter your salary:
//             *  100000
//             *  Your bonus is 10000
//             *  Your total salary is 110000
//             */
//
//            //TODO implement your code here...
//
//            int salary = 0;
//            double bonus = 0;
//            double totalSalary =0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your salary: ");
        int salary = scan.nextInt();

        double bonus = salary / 100 * 10;
        System.out.println("Your bonus is - " + bonus);

        double totalSalary = salary + bonus;
        System.out.println("Your total salary is - " + totalSalary);



    }
}
