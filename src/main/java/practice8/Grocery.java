package practice8;

import java.util.Arrays;
import java.util.Scanner;

public class Grocery {
    public static void main(String[] args) {
        /**
         * Write a program for a shopping
         * Create a list to go shopping in the grocery
         *
         * ex:
         * How many items do you want to add?
         * 3
         * Please enter item #1
         * watermelon
         * Please enter item #2
         * grapes
         * Please enter item #3
         * yogurt
         * Shopping list: [watermelon, grapes, yogurt]
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println(Arrays.toString(createList(scanner)));
        //TODO WRITE YOUR CODE HERE

    }

    public static String[] createList(Scanner scanner) {
        System.out.println("How many items do you want to add?");
        int numOfProd = scanner.nextInt();
        scanner.nextLine();
        String[]  products = new String[numOfProd];
        // TODO IMPLEMENT THIS METHOD
        for (int i = 0; i < products.length; i++){
            System.out.println("Please enter item #" + (i + 1));
            products[i] = scanner.nextLine();
        }
        return products;
    }
}
