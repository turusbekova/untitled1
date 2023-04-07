package practice4;

import java.util.Locale;
import java.util.Scanner;

public class VowelOrConsonant2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Input an alphabet:");
        String character = scan.next().toLowerCase();

        boolean uppercase = character.charAt(0) >= 65 && character.charAt(0) <= 90;
        boolean lowercase = character.charAt(0) >= 97 && character.charAt(0) <= 122;
        boolean vowels = character.equalsIgnoreCase("a") || character.equalsIgnoreCase("e") || character.equalsIgnoreCase("i")
                || character.equalsIgnoreCase("o") || character.equalsIgnoreCase("u");

        if (character.length() > 1){
            System.err.println("Error. It's not a single character!");
        }
        else if (!(uppercase || lowercase)){
            System.out.println("Error. Enter between \"a and z or A and Z\" ");
        }
        else {
            if (vowels){
                System.out.println("It's vowel");
            }
            else {
                System.out.println("It's consonant");
            }
        }

    }
}
