package practice8;

import java.util.Scanner;

public class PrintFirstAndLast {
    public static void main(String[] args) {
        /**
         * Given an array of String, iterate through each word
         * Print first and last letters of each element in a separate line
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter words: ");
        String[] words = {scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine()};

        printLetters(words);
    }

    public static void printLetters(String[] words) {
        String result = " ";
        for (int i = 0; i < words.length; i++){
            result += (words[i].substring(0,1) + words[i].substring(words[i].length()-1) + ", ");
        }
        System.out.println(result);
        //TODO IMPLEMENT THIS METHOD
    }
}
