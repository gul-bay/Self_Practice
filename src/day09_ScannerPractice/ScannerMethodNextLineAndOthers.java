package day09_ScannerPractice;

import java.util.Scanner;

public class ScannerMethodNextLineAndOthers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); //Enter will be left in the Scanners memory

        System.out.println("Enter your age:");
        int age = input.nextInt(); //28 + Enter

        input.nextLine(); //takes the Enter key of the 'nextInt()' method out

        System.out.println("Enter your name:");
        String fullName = input.nextLine();

        System.out.println("age = " + age);
        System.out.println("fullName = " + fullName);











    }
}
