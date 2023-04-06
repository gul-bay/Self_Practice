package day15_BranchingStatementsPractice;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num = 0;

       while(num >=0){
           System.out.println("Enter a number: ");
           num = input.nextInt();
       }



    }
}
/*
Write a program that can repeatedly ask the user to enter a number until user enters a negative number!
This time we don`t know how many times we need to ask the user to enter a number.
Whenever the user enters a negative number that`s the time when we should stop asking the user to enter a number.
If you need to repeat a specific code fragment for unknown number of times, then you can use while loop.
In this scenario while loop is the best.
A variable num is given for storing the user input.
The code fragments that I need to repeat are: "Enter a number: ".
Everytime when this message is displayed I need to get the user entered number.
In order to get the integer, the user entered number and returned as an integer I can use the next.Int() method.
I can also store this user entered number into this variable that I created initially. I just need one variable to store
the number that the user entered.
These statement needs to be repeated over and over again as long as the user did not enter a negative number.
If the user enters a negative number, then I should not repeat this code fragment.
Therefor I place those code fragments inside a while loop; only the code fragments that needs to be repeated, not the object
of scanner or the variable. We just need one object of scanner and one variable, that can contain the user entered number
each time.
I will give the while condition. As long as user entered number num >= 0, that means not negative,
then I should repeatedly ask the user to "Enter a number: "
The variable num will be representing the number that the user entered. I give the initial value zero, but it will be replaced
when the user enters a number.
At the beginning the while condition will be true, then it is going to ask the user to "Enter a number: ".
Then user entered number will be assigned to this variable. Next it will check the condition again.
Once the user entered number is negative then this condition will be evaluated to false -> loop will stop, gets terminated.
Otherwise the loop will continue to get executed.
 */