package day09_ScannerPractice;

import java.util.Scanner;

public class ScannerPracticeMonthName {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = input.nextInt();
        String month;


        switch(num){

            case 1:
                month = "January";
                break;

            case 2:
                month = "February";
                break;

            case 3:
                month = "March";
                break;

            case 4:
                month = "April";
                break;

            case 5:
                month = "May";
                break;

            case 6:
                month = "June";
                break;

            case 7:
                month = "July";
                break;

            case 8:
                month = "August";
                break;

            case 9:
                month = "September";
                break;

            case 10:
                month = "October";
                break;

            case 11:
                month = "November";
                break;

            case 12:
                month = "December";

            default:
                month = "Invalid";
                break;

        }

        System.out.println("The month name is: " + month);


    input.close();



    }
}
/*
MonthName
            3.1 Ask the user to enter a number
            3.2 Display the month name

 */