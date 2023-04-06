package day15_BranchingStatementsPractice;

public class NestedLoop {
    public static void main(String[] args) {

        for (int j = 0; j < 5; j++) {

            for (int i = 1; i <= 10; i++) {
                System.out.print(i +" ");
            }

            System.out.println();

        }


        }





    }

/*
This code fragment that can print me from 1~10 in the same line; it does not append a new line;
all i`s iteration will be printed in the same line.
What if I want to print this 1~10 for 5 times in 5 different lines? This code fragment:

for (int i = 1; i <= 10; i++) {
            System.out.print(i +" ");
        }
needs to be repeated for 5 times.
In order to repeat this code fragment I can use a loop, which is used for repeated action.
If I know the total number of iteration, then I can use the for loop.
I can create a for loop.
The first loop is going to be the inner loop later on; we already used i.
This time we can use j for this loops initialization variable. I want this loop to be repeated for 5 times, so if it
started from 0, I can give 5 for the condition since it is using less than < operator.

for (int j = 0; j < 5; j++)

So this is the loop that will be executed for 5 times.
Whatever code fragment you give in this loops body will be repeated for 5 times.
These are the code fragments that I wanted to repeat 5 times.

for (int i = 1; i <= 10; i++) {
            System.out.print(i +" ");
        }

Therefor I have to place them in the other loops body (outer loop).
This loop now is known as nested loop. Because one loop is created inside another loop.
So the inner loop will be repeated multiple times by the outer loop.
The inner loop is responsible for printing 1~10 and this outer loop is responsible for printing this 1~10 for 5 times.
Since you use the print statement in order to print 1~10 in the same line, it did not append a new line.
After printing 1~10, after the execution of each inner loop, I would like to append a new line. So while I am in the body
of this outer loop I can still add this print statement, which can append a new line.
When the inner loop is executed one time then this statement will also be executed at the same time because it is also
repeated by the outer loop.
That`s how I am able to 1~10 for 5 times.
Since you have the System.out.print(i +" "); print statement it will not append a new line.
After printing 1~10 for each time, after the execution of each inner loop, I want to append a new line.
While I am in te body of the outer loop, I can still add the print statement, which can append a new line.
So when the inner loop is executed one time then the added print statement will be executed at the same time because it is also
repeated by the outer loop.
That`s how I am able to print 1~10 for 5 times.
 */