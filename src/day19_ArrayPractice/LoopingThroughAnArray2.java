package day19_ArrayPractice;

public class LoopingThroughAnArray2 {
    public static void main(String[] args) {

        String[] array = {"Ruby", "Java", "Python", "C#"};

        for(int i = array.length -1; i >= 0; i--){ //shortcut: array.forr, r=reversed order
            System.out.println(array[i]);


        }





    }
}
/*
If you need to iterate the elements of the array in the reversed order, then you need to iterate it from the last index
to index zero of that array, which means in the for loop the initialization should start from the last index number.
Therefor when I declare the for loop the initialization should be the last index number.
In order to assign the last index number to the initialization of the for loop, from the arrays length I will subtract 1,
which is the last index number. This is my initialization of the for loop.
Starting from last index number you need to iterate each indexes in the backwards. You need to iterate it as long as
the index number is greater or equal to zero. Because the minimum index number has to be zero, it cannot be less than
zero. -> The condition should be: As long as the index is greater or equal to zero, you can continue to iterate each
indexes in the reversed order. Reversed order means in the backwards.
If C# is the last index, during the next iteration, it should iterate the 2nd last index.
How do I find the 2nd last index in the 2nd iteration? Index number needs to decreased by 1 each time.
If C# is index 3, in the next iteration of the loop i`s value should be index 2, and then in the next iteration it
should be 1, then zero. So each time the index number should be decreased by one.
Once you have this index number in the reversed order, you can also get the elements in the reversed order.
From the array you can call the array variable, then you can pass the index number i. Right now this i is the reversed
order of the index numbers. Then it is going to print you the elements of the array in the reversed order.

In the intelliJ we also have the shortcut for looping through an array in the reversed order. Whenever you need to
iterate over an array in the reversed order: From the array you will call the function forr.
array.forr
forr means using the loop, looping the i, looping an array in the reversed order. The last r stands for reversed order.
If you wish to loop an array through the reversed order, use this shortcut.
Once you hit the enter, it is going to create you the for loop, that can iterate the array in the reversed order.
Then you can access each successive value of the array in the reversed order by using this variable i, which will print
you the elements of the array in the reversed order
*/