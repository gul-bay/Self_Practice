package day15_BranchingStatementsPractice;

public class BreakStatement {
    public static void main(String[] args) {

        for (int i = 1; i <=10 ; i++) {
            System.out.println(i);

            if(i ==6){
                break; //1,2,3,4,5,6
            }



        }




    }
}
/*
This loop has 10 iterations.
If you want to terminate the loop after specific iteration, then you can use the break statement.
Suppose that after printing 6 I want to terminate the loop, so that the rest of the numbers will not printed again.
Therefor after this print statement once it finished printing 6, I can choose to terminate the loop.
After I set the If condition I can give the break statement.
Now what`s happens is: After printing the number, it is going to check this condition if 6 is printed.
If i=6 (true): the code fragment inside this if gets executed; is already printed,
then it is going to exit the loop. -> 1~6 will be printed. After 6 is printed the break statement is going to terminate this loop.
 */