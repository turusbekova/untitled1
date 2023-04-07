package practice6;

import java.util.Scanner;

public class Pattern {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        /**
         * Write a program that builds a text from a pattern with the following definition
         * 1) Word
         * 2) Separator
         * 3) Times
         *
         * if values are as follows -> word = java, separator = &, times = 2
         * then it should print "java&java"
         */

        System.out.print("Enter the word: ");
        String word = sc.next();
        System.out.print("Enter the separator: ");
        String separator = sc.next();
        System.out.print("Enter the number of times: ");
        int times = sc.nextInt();
        System.out.print(buildText(word, separator, times));


    }

    public static String buildText(String word, String separator, int times) {
        //TODO Implement this method
        int num = 1;
        while (num < times){
            System.out.print(word + separator);
            num++;
        }
        return word;
    }
}
