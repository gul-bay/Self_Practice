package day09_ScannerPractice;

import java.util.Scanner;

public class ScannerPracticeOddOrEven {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = input.nextInt();

        if(num % 2 == 0){
            System.out.println(num + " is even.");

        }else{
            System.out.println(num + " is odd");
        }





        input.close();

        }









    }

/*
Odd or Even number
            1.1 Ask the user to enter a number
            1.2 determine if the number is odd or even
 */