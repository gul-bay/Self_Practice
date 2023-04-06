package day19_ArrayPractice;

import java.util.Arrays;

public class ArrayObject2 {
    public static void main(String[] args) {

        int[] numbers = new int[5];

        numbers[1] = 20;
        //numbers[6] = 70;

        System.out.println(Arrays.toString(numbers));

        System.out.println(numbers[1]);


    }
}
/*
This array that we declared, contains 5 elements. If you have not assigned any elements to the index of this array,
by default the default value will be assigned to the indexes of this array.
If this array has 5 elements -> the last index number will be 4. Because index number always starts from zero.
1st element will have index number zero and last element will have index number of total number of the element minus 1.
Because when you count the total numbers of elements, you counted started from 1. But index numbers are counted
started from zero.
If you want to access any indexes: Once you call the array variable within the square brackets you can give the index
number. E.g. if I need to access the 1st element, I can give the index number zero.
If I want to access the 2nd element I can give the index number 1.
It is going to return you the element right now at index 1.
Also, if you would like to update the values, if you would like to update the element at index 1, then once you access
the index of the element you can use the assignment operator = to assign a new value.
E.g. I can assign 20 to the index 1 of this array. After I assigned this 20 to the index 1 of this array, then once
I print the array
In order to print the single dimensional array you have to call the toString method. It is the static method of the
arrays utility class. From the arrays utility class you call toString method, and then you can pass your array within
the parenthesis.
Once you assigned 20 to the index 1, in this array at index 1 we will have the element 20.
If you want to retreat the element, if you want to get the element from the array, you can also use the index number
within the square brackets.
You can continue to assign the elements to the index of this array. Just make sure that the index number that you
provided it does exist in the array.
If it does not exist in the array, then you will be getting ArrayIndexOutOfBoundException.
E.g. if I try to assign an element to the index 6 of this array, and then I am trying to assign 70.
If the arrays size is 5 and the size of the array is fixed, that means the maximum index number is 4. So when you give
the index number that does not exist within the square bracket, then you will be getting ArrayIndexOutOfBoundException.
So when you are accessing or updating the elements of the array, the index number that you give within the square
brackets has to be a valid index number.
 */