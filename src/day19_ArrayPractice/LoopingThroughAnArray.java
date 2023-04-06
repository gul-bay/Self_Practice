package day19_ArrayPractice;

public class LoopingThroughAnArray {
    public static void main(String[] args) {

        String[] array = {"Cydeo", "Java", "Wooden Spoon"};

        for(int i = 0; i <= array.length -1; i++){ //shortcut: array.fori, i=index order
            /* (int i = 0; i < array.length; i++)    the length of the array will be excluded; it will only include
                                                     till length -1.
            */

            System.out.println(array[i]);
        }




    }
}
/*
Suppose if you have an array that contains multiple elements, e.g. 10 or 100s of elements, and you need to access each
successive value of that array.
In this case it is better if we apply the loop. Loop is going to repeat it for you, calling the array and then
providing the next part. So you can access each successive value of an array.
If I need to iterate over each element of this array above, then I can apply the loop to iterate the indexes of this array.
I can loop through this array and I can get every single indexes in the loop.
E.g. when I declare the loop I can let this initialization variable to represent the index numbers of this array,
started from zero. I need to iterate this array starting from index zero till the last index number.
In order to include the last index number, the last index number should be the length of the array minus 1.
This is going to give you the last index number.
During each iteration the index number should be increased by 1, in order to get every single index.
This variable i is now the index number of this array. It started from zero, it starts before it reads the length.
You can use this i as the index number to get each element of this array.
E.g. if I need to print every single elements of this array in separate lines -> In this loop I will call the array,
then I will access the index numbers. So here my index number is i.
When the loop 1st executed, i`s value will be zero, then it is going to print you the 1st element.
In the next iteration it is going to get you the next and the next; it will go on after that.
This loop will stop after getting the last element of this array. Because the last value of this array.
Because the maximum value of this i will be length -1, which is the last index number.
After printing the last element at the last index number, then this loop is going to stop.
If I run it every single element of this array will be printed in each separate lines on the console.

Also in the intelliJ we have shortcuts for looping through an array. If you need to loop through an array, instead of
declaring the for loop by yourself one by one, you can give the array variable name, dot, then you need to call fori
-> array.fori.
This is going to give you the for loop, that can help you to iterate over an array in the index order.
i stands here for the index order. You can use this i as the number to get each element of the array.
This is how you can iterate over an array in the index order.
 */