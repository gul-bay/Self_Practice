package day15_BranchingStatementsPractice;

public class ContinueStatement {
    public static void main(String[] args) {

        for (int i = 1; i <= 5 ; i++) {

           if(i == 3 || i == 4){
            continue; //1,2,5
           }
            System.out.println(i);
        }






    }
}
/*
This loop has 5 iterations. It is printing 1~5.
If you would like to skip the iteration, if you don`t want the number 3 to be printed on the console.
Whenever i reaches 3 I would like to skip it. -> Before the execution of the print statement you can create the condition to check if i`s
value is reached 3 or not. If i has reach 3 before printing you can choose to skip by giving the continue statement.
The definition of this code fragment is, whenever i`s value is 3 it is going to skip the iteration, which means the code fragment in the loop
after this continue statement will be skipped in that iteration.
In the next iteration it will still continue to be printed. It is only skipping the 3rd iteration. -> 1,2,4,5
If I also would like to skip the iteration 4, then I can add the condition || i = 4 again. -> 1,2,5
We give the if statement before printing. Before printing it checks the condition if I already 3 or 4. If it already reaches it is
going to skip them.
The continue statement is used for skipping the iteration of the loop.
You can use this in any loops.
 */