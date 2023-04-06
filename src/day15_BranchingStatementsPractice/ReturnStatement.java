package day15_BranchingStatementsPractice;

public class ReturnStatement {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {

            System.out.println(i);

            if(i == 6){
                return;
            }

        }

        System.out.println("Task Completed");




    }
}
/*
Return statement is used for exiting the current method. Under whichever method you used the return statement at, that method
will be exited. Once the return statement gets executed the method will exit, which means any code fragment within this method
after the return statement will not be executed afterwards.
If your intention is not just exit the loop, but exit the method under specific condition, then you can use the return statement.
You can use the return statement anywhere, not only inside the loop, but also outside the loop or any other blocks.
So if you want to exit the method you can give this return statement. Once the return statement gets executed,
since I give the return statement under the main method, this main method will get exits.
If it exits in line 11 -> any code fragments after line 11 never get executed; 1~6 is printed, then it exited the method.
The code fragment "Task Completed" will never get printed because it is inside the method.

This return statement will also allow us to return a specific value when we exit the method.
 */