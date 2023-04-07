package practice2;

import java.util.Scanner;

public class FirstTask {

    public static void main(String[] args) {

        //            System.out.println("===================================");
//            System.out.println("TASK #1");
//            /**
//             *
//             * Create a service to calculate a perimeter of a rectangle.
//             * Tasks:
//             * 1) have two inputs to your system
//             * 2) calculate perimeter
//             * 3) print out your result
//             *
//             * Example output:
//             *  Enter your length:
//             *  2
//             *  Enter your width:
//             *  1
//             *  Your perimeter is equal to 6.
//             *
//             */
//
//            //TODO implement your code here...
//            int length = 0;
//            int width = 0;
//            int perimeter = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your length: ");
        int length = scan.nextInt();
        System.out.println(length + " - this is length");

        System.out.println("Enter your width: ");
        int width = scan.nextInt();
        System.out.println(width + " - this is width");

        int perimeter = 2 * (length + width);
        System.out.println("your perimeter is equal to: " + perimeter);
    }
}
