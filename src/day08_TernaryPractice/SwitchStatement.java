package day08_TernaryPractice;

import day01_practices.GasReceipt;

import java.util.SortedMap;

public class SwitchStatement {
    public static void main(String[] args) {

        char grade = 'B';

        if(grade == 'A'){
            System.out.println("Excellent");
        }else if(grade == 'B'){
            System.out.println("Great Job");
        }else if(grade == 'C'){
            System.out.println("Good");
        }else if(grade == 'D'){
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }

        System.out.println("--------------------------------");

        switch(grade){
            case 'A':
                System.out.println("Excellent");
                break;
            /*if you have those case blocks, then you had to give the code fragments that needs to be executed under those case blocks
              after printing "Excellent" we should exit the Switch. If the grade is A it should just print "E.." and none of the other case blocks should be executed.
              In order to exit the switch this break statement will be required. If you do not give the break statement, after printing "E.." it will continue to execute the remaining
              blocks until the closing curly brace of Switch or another break statement.*/
            case 'B':
                System.out.println("Great Job");
                break;

            case 'C':
                System.out.println("Good");
                break;

            case 'D':
                System.out.println("Passed");
                break;

            default:
                System.out.println("Failed");
                /*gets executed, if none of the case blocks are matching with the Switch Statements expression.
                  If this is the last block you don`t need the break statement because it will exit switch afterwards*/

        }















    }
}

