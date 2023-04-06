package day09_ScannerPractice;

import java.util.Scanner;

public class ScannerPracticeEligibleOrNot {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age:");

        byte age = input.nextByte();

        if(age >=21){
            System.out.println("You are eligible to buy alcohol.");
        }else{
            System.out.println("You are not eligible to buy alcohol.");
        }

        input.close();








    }
}
/*
Eligible or not Eligible to buy alcohol
            2.1 Ask the user to enter his/her age
            2.2 write a program that can check if the person eligible to buy alcohol

 */