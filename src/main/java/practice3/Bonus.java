package practice3;

import java.util.Scanner;

public class Bonus {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your salary: ");
        int salary = scan.nextInt();
        System.out.println("Enter years of services: ");
        int yearOfService = scan.nextInt();
        double bonus3 = salary / 100 * 3;
        double bonus5 = salary / 100 * 5;


        if (yearOfService >= 3 && yearOfService < 5){
            System.out.println("Your bonus is " + bonus3);
        }
        else if (yearOfService >= 5){
            System.out.println("Your bonus is " + bonus5);
        }
    }
}
