package day09_ScannerPractice;

import java.util.Scanner;

public class ScannerMethodNext {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word:");
        String str =input.next(); //whenever you want to get one word from the user you can use next() method

        System.out.println(str);



    }
}
