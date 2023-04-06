package day19_ArrayPractice;

import java.util.Arrays;

public class ArrayObject {
    public static void main(String[] args) {

        int[] numbers;
        numbers = new int[5];

        // int[] numbers = new int[5]; //using the assignment operator and assigning the array object in the same line.

        System.out.println(Arrays.toString(numbers)); //0, 0, 0, 0,0
    }
}
/*
We can use Array whenever we would like to store multiple values of same data type. Array acts as a container for the
multiple values of the same data type.
Array size is fixed. If you know how many elements will be stored in the array, then you can create an array variable
and instantiate the array.
E.g. if I need to store 5 elements into my array: If the elements are going to be integers 1st I give the data type for
integer. Since array supports both primitives and non-primitives you can use int as well for primitives if you have
integer values.
Then you can give the square brackets followed by the data type, or you can give the square brackets after the variable.
As long as you have one pair of square brackets -> single dimensional array.
Usually it is preferred to give the square brackets after the data type.
This indicates that this is an array variable, that I am trying to create.
Now I can declare my array variable: numbers.
Next you need to instantiate the array object to this array variable. You can do this in the same line or in the next
line. If you do it in the next line 1st you have to call the array variable, and then you need to assign the array
object. So you give the new keyword. Then you give the data type of the array object and then the square brackets. ->
Now it is going to ask you to provide an integer number, which acts as the length, the size of the array.
Since we stated that the size of the array is fixed any number that you give here, it will be the size of the array
object. That size of this array object is not changeable. If I give the number 5 -> the size of this array is 5, which
means there must be 5 elements in this array right now.
Even though you don`t assign any elements right now, you only initialize the size -> default value of this integer
will be given. In Java default value of integer is zero.
Right now in this array we have 5 zeros, since we have not assigned any elements to any indexes.
In order to print the array you will have to use a special method called toString. From the Arrays utility class you
need to call the toString method. Make sure that the Arrays utility class is imported here.
Then you give the array variable.
We finished instantiating an array and set the size to 5. -> By default there will be 5 zeros right now in this array.
*/