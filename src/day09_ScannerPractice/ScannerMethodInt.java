package day09_ScannerPractice;

import java.util.Scanner;

public class ScannerMethodInt {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age: "); //Message to make it understandable for the user. Java executes codes from top to bottom.
        int age = input.nextInt();       //using the Scanner Method that is in the range of the data type value; it is going to wait for the keyboard entry.
//it returns you integer -> therefore you can assign it to a variable. Once you assign a variable, you can continue to use this variable.

        System.out.println("age = " + age);  //keyboard entry 25 -> age is assigned to 25 (integer value)











    }

}
