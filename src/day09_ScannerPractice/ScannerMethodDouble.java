package day09_ScannerPractice;

import java.util.Scanner;

public class ScannerMethodDouble {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a decimal number"); //message for understandability

        //input.nextInt(); //input mismatch exception; using the right method is important

        double num = input.nextDouble(); //returned type of nextDouble will be double primitive; therefore I can assign it to a variable (num)

        System.out.println("You have entered " +num); //once this method gets executed it waits for keyboard entry; write 2,5, hit the enter -> assigned to the variable num


    }


}
