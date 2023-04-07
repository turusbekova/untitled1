package practice8;

import javax.jws.soap.SOAPBinding;
import java.util.Arrays;
import java.util.Scanner;

public class VerifyArrays {
    public static void main(String[] args) {
        /**
         * Write a program that checks if the given two arrays are equal
         *
         * Values and indexes must match.
         * must be case-sensitive
         *
         * EX:
         * String[] arr1 = new String[]{"A", "B", "C"};
         * String[] arr2 = new String[]{"A", "B", "C"}
         *
         * true
         *
         * EX2:
         * String[] arr2 = new String[]{"A", "B", "C"};
         * String[] arr3 = new String[]{"B", "B", "A"};
         *
         * false
         */

        //TODO WRITE YOUR CODE HERE
        String[] arr1 = new String[]{"A", "B", "C"};
        String[] arr2 = new String[]{"A", "F", "C"};
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println("Answer is " + areEqual(arr1, arr2));
        System.out.println("Answer is " + areEqual2(arr1, arr2));


    }


    public static boolean areEqual(String[] arr1, String[] arr2) {
        //TODO IMPLEMENT THIS METHOD
        int count = 0;
        for (int i=0; i<arr1.length;i++){
            if(arr1[i].equals(arr2[i])){
                count++;
            }
            if (count == 3){
                return true;
            }
        }

        return false;
    }

    public static boolean areEqual2(String[] arr1, String[] arr2){
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }
}
