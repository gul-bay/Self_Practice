package day15_BranchingStatementsPractice;

public class DoWhileLoop {
    public static void main(String[] args) {

        int num = 10;

        while(num > 1000){
            System.out.println("Hello World");
        }

        System.out.println("------------------------------------------------------------------");

    do{
        System.out.println("Hello World");
    }while(num > 1000);




    }
}
/*
In the while loop the code fragment do not get executed because the condition is evaluated to false.

In the do while loop even though the condition is false, the condition is not the one that will be checked at the start
of the loop. At the start of the loop the do block gets executed, then the condition will be checked.
That means whatever code fragment you give in the do block it will be executed first, then the condition will be checked.
If the condition is true then the do block will be repeated.
Although this condition is false the do block still gets executed once. Then it will not be executed for a 2nd time
if the condition is false.
 */